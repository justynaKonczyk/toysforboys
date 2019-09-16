package be.vdab.toysforboystest.repositories;

import be.vdab.toysforboystest.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomOrderRepositoryImpl implements CustomOrderRepository{

    @Autowired
    private EntityManager manager;

    @Override
    public List<Order> findUnshipped() {
        return manager.createQuery("select from Order o where status not in ('SHIPPED','CANCELLED')").getResultList();
    }
}
