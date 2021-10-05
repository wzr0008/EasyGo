package Dispatch.Service;

import Dispatch.POJO.Trip;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("Trip")
public interface TripService {
    @PostMapping("/trips")
    public String create(@RequestBody Trip inputTrip);
}
