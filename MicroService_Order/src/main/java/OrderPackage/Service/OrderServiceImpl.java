package OrderPackage.Service;

import OrderPackage.Dao.OrderDao;
import OrderPackage.POJO.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService{
    private OrderDao orderDao;
    @Override
    public void create(Order inputOrder) {
        Order order=new Order(inputOrder.getTripId(),inputOrder.getStatus());
        orderDao.save(order);
        return;
        }

    @Override
    public List<Order> getall() {
        return orderDao.findAll();
    }

    @Override
    public Order getOne(int id) {
        Optional<Order> result=null;
        result=orderDao.findById(id);
        if(result.isPresent())
            return result.get();
        return null;
    }

    @Override
    public Order update(int id, Order order) {
        Optional<Order> optional = orderDao.findById(id);
        if(optional.isPresent()){
            Order newone=new Order(id,order.getTripId(), order.getStatus(), optional.get().getCreatedAt());
            orderDao.save(newone);
            return newone;
        }
        return null;
    }
}
