package UserPackage.Service;

import UserPackage.DAO.UserDao;
import UserPackage.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findbyId(Integer id) {
        return userDao.findById(id).get();
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void deletebyId(Integer id) {
        userDao.deleteById(id);
    }

}
