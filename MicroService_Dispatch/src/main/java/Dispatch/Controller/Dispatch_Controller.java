package Dispatch.Controller;

import Dispatch.POJO.Driver;
import Dispatch.POJO.Trip;
import Dispatch.Service.DriverService;
import Dispatch.Service.JedisService;
import Dispatch.Service.TripService;
import Dispatch.Service.restTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Dispatch_Controller {
    @Autowired
    Dispatch.Service.restTemplate restTemplate;
    @Autowired
    JedisService jedisService;
    @Autowired
    DriverService driverService;
    @Autowired
    TripService tripService;
    double[] userLocation=new double[]{0.0,0.0};
    double[] driverLocation=new double[]{0.0,0.0};
    static int TransId=0;
    @GetMapping("/Dispatch/{UserId}/{UserLocation}")
    @HystrixCommand(fallbackMethod="fallback")
    public Trip findDriver(@PathVariable int UserId, @PathVariable int UserLocation){
        List<Driver> allDriver= driverService.findall();
        Driver bestDriver=null;
        Double nearest=Double.MAX_VALUE;
        for(Driver driver:allDriver){
            if(jedisService.getval(driver.getId()+"").equals("0")){
                double distance=dist(userLocation,driverLocation);
                if(distance<nearest){
                    nearest=distance;
                    bestDriver=driver;
                }
            }
        }
        Trip ans=null;
        if(bestDriver!=null){
            ans=new Trip(TransId++, bestDriver.getId(), UserId,UserLocation+"",null,1);
        }
        return ans;
    }
    public String fallback(){
        return "There is an internal connection problem. The service is rebooting!!!";
    }
    private double dist(double[] a, double[] b) {
        return Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2);
    }
}
