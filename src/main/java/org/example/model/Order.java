package org.example.model;

import java.util.List;
/**
 * @author Manuel Aguilera / @aguileradev
 */
public class Order {
    private Client client;
    private List<Dish> dishes;

    public Order(Client client, List<Dish> dishes) {
        this.client = client;
        this.dishes = dishes;
    }

    public Order() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Order{" +
                "\nclient=" + client +
                "\ndishes=" + dishes +
                '}';
    }
}
