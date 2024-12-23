package org.example.controllers;

import org.example.controllers.interfaces.IController;
import org.example.model.Order;
import org.example.service.order.FindAllOrdersImpl;

import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class FindAllOrdersController implements IController {
    private FindAllOrdersImpl findAllOrders;

    public FindAllOrdersController(FindAllOrdersImpl findAllOrders) {
        this.findAllOrders = findAllOrders;
    }

    @Override
    public void execute() {
        List<Order> orders = findAllOrders.execute();
        orders.stream().forEach(order -> {
            System.out.println(order);
            order.getDishes().forEach(dish -> dish.serve());
        });
        }
}
