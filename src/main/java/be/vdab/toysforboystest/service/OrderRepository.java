package be.vdab.toysforboystest.service;

import be.vdab.toysforboystest.entity.Order;


import java.util.List;
import java.util.Optional;

public interface OrderRepository  {

    Optional<Order> findById(Long id);
    List<Order> findUnshipped();
}
