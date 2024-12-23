package org.example.service.client;

import org.example.model.Client;
import org.example.repository.ClientRepository;
import org.example.service.interfaces.ICommand;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class FindClientImpl implements ICommand<Client> {
    private ClientRepository clientRepository;
    private Integer id;

    public FindClientImpl(Integer id) {
        this.clientRepository = ClientRepository.getInstance();
        this.id = id;
    }
    @Override
    public Client execute() {
        return clientRepository.getClients().stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }
}
