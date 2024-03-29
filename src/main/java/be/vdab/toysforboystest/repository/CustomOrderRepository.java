package be.vdab.toysforboystest.repository;

import be.vdab.toysforboystest.entity.Order;

import java.util.List;
import java.util.Optional;

public interface CustomOrderRepository {

    Optional<Order> findById(Long id);
    List<Order> findUnshipped();

}
