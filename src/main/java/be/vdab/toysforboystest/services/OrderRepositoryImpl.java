package be.vdab.toysforboystest.services;

import be.vdab.toysforboystest.entity.Order;
import be.vdab.toysforboystest.repositories.CustomOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderRepositoryImpl implements OrderRepository {

    private final CustomOrderRepository customOrderRepository;

    public OrderRepositoryImpl(CustomOrderRepository customOrderRepository) {
        this.customOrderRepository = customOrderRepository;
    }

    @Override
    public Optional<Order> findById(Long id) {
        return customOrderRepository.findById(id);
    }

    @Override
    public List<Order> findUnshipped() {
        return customOrderRepository.findUnshipped();
    }
}
