package Trip.Dao;

import Trip.POJO.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface TripDao extends JpaRepository<Trip,Integer> {
    List<Trip> findByDriverId(int driverId);
    List<Trip> findByRiderId(int riderId);
    List<Trip> findByDriverIdAndRiderId(int driverId,int riderId);
}
