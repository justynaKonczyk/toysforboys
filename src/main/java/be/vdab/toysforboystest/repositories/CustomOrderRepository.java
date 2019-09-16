package be.vdab.toysforboystest.repositories;

import be.vdab.toysforboystest.entity.Order;

import java.util.List;

public interface CustomOrderRepository {

    List<Order> findUnshipped();

}
