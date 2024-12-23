package org.example.repository;


import org.example.model.Client;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ClientRepository {

    private static ClientRepository INSTANCE;

    private List<Client> clients;

    private ClientRepository(){
        this.clients = new LinkedList<>();
    }

    public static synchronized ClientRepository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ClientRepository();
        }
        return INSTANCE;
    }

    public List<Client> getClients() {
        return clients;
    }
    public void addClient(Client client){
        clients.add(client);
    }
}
