package OrderPackage.Controller;

import OrderPackage.POJO.Order;
import OrderPackage.Service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;
    @PostMapping("/orders")
    public String create(@RequestBody Order inputOrder){
        return "Created Successfully";
    }
    @GetMapping("/orders")
    public List<Order> getAll(){
        return orderService.getall();
    }
    @GetMapping("/order/{id}")
    public Order get(@PathVariable int id){
        return orderService.getOne(id);
    }
    @PutMapping("/orders/{id}")
    public Order update(@PathVariable int id,@RequestBody Order order){
        return orderService.update(id,order);
    }
}
