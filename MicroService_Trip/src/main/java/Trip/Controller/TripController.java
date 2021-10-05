package Trip.Controller;

import Trip.POJO.Driver;
import Trip.POJO.Trip;
import Trip.Service.JedisService;
import Trip.Service.TripServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
public class TripController {
    @Autowired
    TripServiceImpl TripService;
    @Autowired
    JedisService jedisService;
    @PostMapping("/trips")
    public String create(@RequestBody Trip inputTrip){
       TripService.create(inputTrip);
       int driverId=inputTrip.getDriverId();
       jedisService.add(""+driverId,""+1);
       return "A new Trip is created successfully";
    }
    @GetMapping("/trips")
    public List<Trip> findall(){
        return TripService.findall();
    }
    @GetMapping("/trips/{id}")
    public Trip get(@PathVariable int id){
        return TripService.get(id);
    }
    @PutMapping("/trips/{id}")
    public Trip update(@PathVariable int id,@RequestBody Trip trip){
        return TripService.update(id,trip);
    }
    @DeleteMapping("/trips/{id}")
    public Trip delete(@PathVariable int id){
        Trip cur=TripService.delete(id);
        jedisService.add(""+cur.getId(),""+0);
        return cur;
    }


}
