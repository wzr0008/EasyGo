package Trip.Service;

import Trip.Dao.TripDao;
import Trip.POJO.Trip;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS.optional;
@Service
public class TripServiceImpl implements TripService {
    @Autowired
    TripDao tripDao;
    @Override
    public void create(Trip trip) {
        tripDao.save(trip);
    }

    @Override
    public List<Trip> findall() {
        return tripDao.findAll();
    }

    @Override
    public Trip get(int id) {
        Optional<Trip> optional = tripDao.findById(id);
        if(optional !=null)
            return optional.get();
        return null;
    }

    @Override
    public Trip update(int id, Trip trip) {
        Optional<Trip> optional=tripDao.findById(id);
        if(optional!=null){
            Trip last=new Trip(id,trip.getDriverId(),trip.getRiderId(),trip.getOrigin(),trip.getDestination(),trip.getStatus(),optional.get().getCreatedAt());
            tripDao.save(last);
            return last;
        }
        return null;
    }

    @Override
    public Trip delete(int id) {
        Optional<Trip> optional=tripDao.findById(id);
        if(optional!=null){
            Trip last=optional.get();
            tripDao.delete(last);
            return last;
        }
        return null;
    }
}
