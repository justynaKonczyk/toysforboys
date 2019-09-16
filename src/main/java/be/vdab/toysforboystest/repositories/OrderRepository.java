package be.vdab.toysforboystest.repositories;

import be.vdab.toysforboystest.entity.Order;
import be.vdab.toysforboystest.services.JpaOrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaOrderRepository<Order, Long>, CustomOrderRepository {
}
