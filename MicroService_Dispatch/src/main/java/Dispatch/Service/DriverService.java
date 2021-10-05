package Dispatch.Service;

import Dispatch.POJO.Driver;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("DRIVER")
public interface DriverService {
    @GetMapping("/drivers")
    public List<Driver> findall();


}
