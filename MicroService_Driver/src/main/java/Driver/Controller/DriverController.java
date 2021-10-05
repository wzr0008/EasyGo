package Driver.Controller;

import Driver.POJO.Driver;
import Driver.Service.DriverServiceImpl;
import Driver.Service.JedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

   @Autowired
   JedisService jedisService;
    @Autowired
    DriverServiceImpl driverService;
    @GetMapping("/drivers/ping")
    public String ping(){
    return jedisService.ping();
    }
    @GetMapping("/drivers")
    public List<Driver> findall(){
        return driverService.findall();
    }
    @PostMapping("/drivers")
    public Driver create(@RequestBody Driver driver){
        driverService.create(driver);
        int id=driver.getId();
        jedisService.set(""+id,""+-1);
        return driver;
    }
    @PutMapping("/drivers/{id}")
    public Driver update(@PathVariable int id,@RequestBody Driver driver){
        return driverService.update(id,driver);
    }
    @DeleteMapping("/drivers/{id}")
    public Driver del(@PathVariable int id){
        return driverService.delete(id);
    }


}
