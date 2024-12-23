package org.example.controllers;

import org.example.controllers.interfaces.IController;
import org.example.model.Client;
import org.example.service.client.CreateClientImpl;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class AddClientController implements IController {
    private CreateClientImpl clientService;

    public AddClientController(CreateClientImpl clientService) {
        this.clientService = clientService;
    }

    @Override
    public void execute() {
        Client client = clientService.execute();
        System.out.printf("Cliente %s creado con exito%n", client.getName());
    }
}
