package OrderPackage.Service;

import OrderPackage.POJO.Order;
import java.util.*;
public interface OrderService {
public void create(Order order);
public List<Order> getall();
public Order getOne(int id);
public Order update(int id,Order order);

}
