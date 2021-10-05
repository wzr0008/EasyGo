package Driver.Service;

import Driver.DAO.DriverDao;
import Driver.POJO.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverDao driverDao;
    @Override
    public void create(Driver driver) {
        driverDao.save(driver);
        return;
    }

    @Override
    public List<Driver> findall() {
        return driverDao.findAll();
    }

    @Override
    public Driver find(int id) {
        Optional<Driver> optional=driverDao.findById(id);
        if(optional!=null){
            return optional.get();
        }
        return null;
    }

    @Override
    public Driver update(int id, Driver driver) {
        Optional<Driver> optional=driverDao.findById(id);
        if(optional!=null){
            Driver cur=new Driver(id,driver.getFirstname(),driver.getLastname(),driver.getPhone(),driver.getEmail());
            driverDao.save(cur);
            return cur;

        }
        return null;
    }

    @Override
    public Driver delete(int id) {
        Optional<Driver> optional=driverDao.findById(id);
        if(optional!=null){
            Driver cur=optional.get();
            driverDao.deleteById(id);
            return cur;
        }
        return null;
    }
}
