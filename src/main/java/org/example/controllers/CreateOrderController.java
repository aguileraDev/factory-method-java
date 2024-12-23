package org.example.controllers;

import org.example.controllers.interfaces.IController;
import org.example.service.order.CreateOrderImpl;
import org.example.utils.ConsoleUtil;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class CreateOrderController implements IController {
    private CreateOrderImpl createOrder;

    public CreateOrderController(CreateOrderImpl createOrder) {
        this.createOrder = createOrder;
    }

    @Override
    public void execute() {
        createOrder.execute();
    }
}
