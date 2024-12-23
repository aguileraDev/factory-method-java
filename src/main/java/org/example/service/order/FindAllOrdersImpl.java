package org.example.service.order;

import org.example.model.Order;
import org.example.repository.OrderRepository;
import org.example.service.interfaces.ICommand;

import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class FindAllOrdersImpl implements ICommand<List<Order>> {
    private OrderRepository orderRepository;

    public FindAllOrdersImpl() {
        this.orderRepository = OrderRepository.getInstance();
    }

    @Override
    public List<Order> execute() {
        System.out.println("Listado de pedidos: ");
        return orderRepository.getOrders();
    }
}
