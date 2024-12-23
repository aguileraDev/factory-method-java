package org.example.service.client;

import org.example.model.Client;
import org.example.repository.ClientRepository;
import org.example.service.interfaces.ICommand;
import org.example.utils.ConsoleUtil;


/**
 * @author Manuel Aguilera / @aguileradev
 */
public class CreateClientImpl implements ICommand<Client> {
   private ClientRepository clientRepository;
   private ConsoleUtil console;

   public CreateClientImpl(ConsoleUtil console){
       this.clientRepository = ClientRepository.getInstance();
       this.console = console;
   }

    @Override
    public Client execute() {
        Integer id = console.captureInteger("Ingrese el id del cliente: ");
        String name = console.captureString("Ingrese el nombre del cliente: ");
        Client client = new Client(id, name);
        clientRepository.addClient(client);
        return client;
    }
}
