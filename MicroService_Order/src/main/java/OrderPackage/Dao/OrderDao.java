package OrderPackage.Dao;

import OrderPackage.POJO.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Integer> {
}
