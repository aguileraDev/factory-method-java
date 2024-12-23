package org.example.service.order;

import org.example.model.Client;
import org.example.model.Dish;
import org.example.model.Order;
import org.example.repository.ClientRepository;
import org.example.repository.DishRepository;
import org.example.repository.OrderRepository;
import org.example.service.client.CreateClientImpl;
import org.example.service.client.FindClientImpl;
import org.example.service.interfaces.ICommand;
import org.example.utils.ConsoleUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class CreateOrderImpl implements ICommand<Order> {
    private OrderRepository orderRepository;
    private ClientRepository clientRepository;
    private DishRepository dishRepository;
    private CreateClientImpl createClient;
    private FindClientImpl findClient;
    private ConsoleUtil console;

    public CreateOrderImpl(ConsoleUtil console, CreateClientImpl createClient) {
        this.orderRepository = OrderRepository.getInstance();
        this.clientRepository = ClientRepository.getInstance();
        this.dishRepository = DishRepository.getInstance();
        this.console = console;
        this.createClient = createClient;
    }

    @Override
    public Order execute() {
        Boolean haveClient = clientRepository.getClients().stream().anyMatch(c -> c.getId().equals(console.captureInteger("Ingrese el id del cliente: ")));
        Client registerClient = new Client();
        if(!haveClient){
            System.out.println("No hay clientes registrados. Por favor registre un nuevo cliente.");
            registerClient = createClient.execute();
        }
        printDishes();
        Order order = new Order(registerClient, captureDishes());
        orderRepository.addOrder(order);
        return order;
    }

    public void printDishes(){
        System.out.println("platos disponbles: ");
        dishRepository.getDishes().forEach(System.out::println);
    }
    public List<Dish> captureDishes(){
        List<Dish> selectedDish = new LinkedList<>();
        for(Dish dish : dishRepository.getDishes()){
            System.out.println("Desea llevar el plato: "+dish.getName()+"?");
            if(console.captureBoolean("Si/No")) {
                dish.prepare();
                selectedDish.add(dish);
            }
        }

        return selectedDish;
    }
}
