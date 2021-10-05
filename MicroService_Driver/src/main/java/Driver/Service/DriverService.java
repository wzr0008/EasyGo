package Driver.Service;

import Driver.POJO.Driver;

import java.util.List;

public interface DriverService {
    public void create(Driver driver);
    public List<Driver> findall();
    public Driver find(int id);
    public Driver update(int id,Driver driver);
    public Driver delete(int id);
}
