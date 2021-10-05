package Trip.Service;

import Trip.POJO.Trip;

import java.util.List;

public interface TripService {
    public void create(Trip trip);
    public List<Trip> findall();
    public Trip get(int id);
    public Trip update(int id,Trip trip);
    public Trip delete(int id);
}
