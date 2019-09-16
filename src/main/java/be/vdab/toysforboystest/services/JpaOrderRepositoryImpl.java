package be.vdab.toysforboystest.services;

import be.vdab.toysforboystest.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaOrderRepositoryImpl implements JpaOrderRepository {

    @Autowired
    private JpaOrderRepository orderRepository;

    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> findUnshipped() {
        return orderRepository.findUnshipped();
    }
}
