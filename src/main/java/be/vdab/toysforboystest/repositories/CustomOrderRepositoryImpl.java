package be.vdab.toysforboystest.repositories;

import be.vdab.toysforboystest.entity.Order;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomOrderRepositoryImpl implements CustomOrderRepository{

    private final EntityManager manager;

    public CustomOrderRepositoryImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.ofNullable(manager.find(Order.class, id));
    }

    @Override
    public List<Order> findUnshipped() {
        return manager.createQuery("select o from Order o where o.status not in ('SHIPPED','CANCELLED')").getResultList();
    }
}
