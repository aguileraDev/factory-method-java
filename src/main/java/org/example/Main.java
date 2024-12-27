package org.example;

import org.example.controllers.CreateOrderController;
import org.example.controllers.FindAllOrdersController;
import org.example.factory.creator.ChefFactory;
import org.example.factory.creator.ChefFactoryChocolateCake;
import org.example.factory.creator.ChefFactoryHamburguer;
import org.example.factory.creator.ChefFactoryPizza;
import org.example.model.Dish;
import org.example.repository.DishRepository;
import org.example.service.client.CreateClientImpl;
import org.example.service.order.CreateOrderImpl;
import org.example.service.order.FindAllOrdersImpl;
import org.example.utils.ConsoleUtil;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ConsoleUtil console = new ConsoleUtil();

        ChefFactory chefFactoryPizza = new ChefFactoryPizza();
        Dish pizza = chefFactoryPizza.prepareDish();

        ChefFactory chocolateCakeChefFactory = new ChefFactoryChocolateCake();
        Dish chocolateCake = chocolateCakeChefFactory.prepareDish();

        ChefFactory chefFactoryHamburguer = new ChefFactoryHamburguer();
        Dish burger = chefFactoryHamburguer.prepareDish();

        DishRepository.getInstance().addDish(pizza);
        DishRepository.getInstance().addDish(chocolateCake);
        DishRepository.getInstance().addDish(burger);

        CreateOrderController createOrderController = new CreateOrderController(new CreateOrderImpl(console, new CreateClientImpl(console)));
        FindAllOrdersController findAllOrdersController = new FindAllOrdersController(new FindAllOrdersImpl());

        Integer option = 0;

        do {
            System.out.println("Bienvenido al sistema de pedidos.");
            System.out.println("1. Crear un pedido");
            System.out.println("2. Ver mis pedidos");
            System.out.println("3. Salir");
            option = console.captureInteger("Seleccione una opcion:");

            if (option == 1){
                createOrderController.execute();
            }

            if(option == 2){
                findAllOrdersController.execute();
            }
        }while (option != 3);


    }
}