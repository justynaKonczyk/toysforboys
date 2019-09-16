package be.vdab.toysforboystest.services;

import be.vdab.toysforboystest.entity.Order;


import java.util.List;
import java.util.Optional;

public interface JpaOrderRepository<O, L extends Number> {

    Optional<Order> findById(Long id);
    List<Order> findUnshipped();

}
