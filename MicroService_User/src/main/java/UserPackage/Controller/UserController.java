package UserPackage.Controller;

import UserPackage.POJO.User;
import UserPackage.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userApplication;
    @GetMapping("/finall")
    public List<User> findAll(){
        return userApplication.findAll();
    }
    @GetMapping("/{id}")
    public User findbyId(@PathVariable Integer id){
        return userApplication.findbyId(id);
    }
    @PostMapping("/post")
    public void add(@RequestBody User user){
        userApplication.add(user);
    }
    @PutMapping("/del/{id}")
    public void update(@PathVariable Integer id, @RequestBody User user){
        user.setId(id);
        userApplication.update(user);
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello, the connection is OK!!!";
    }

}
