package UserPackage.Service;

import UserPackage.POJO.User;

import java.util.List;
import java.util.*;
public interface UserService {
    public List<User> findAll();
    public User findbyId(Integer id);
    public void add(User user);
    public void update(User user);
    public void deletebyId(Integer id);
}
