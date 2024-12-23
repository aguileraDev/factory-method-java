package org.example.repository;

import org.example.model.Order;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class OrderRepository {
    private List<Order> orders;


    private OrderRepository(){
        this.orders = new LinkedList<>();
    }

    private static class OrderRepositoryHolder {
        private static final OrderRepository INSTANCE = new OrderRepository();
    }

    public static OrderRepository getInstance() {
        return OrderRepositoryHolder.INSTANCE;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

}
