package org.example.factory.creator;

import org.example.factory.Pizza;
import org.example.model.Dish;

/**
 * @author Manuel Aguilera / @aguileradev
 */
// Paso 4 Definir los fabricantes concretos
public class ChefPizza extends Chef {


    @Override
    public Dish prepareDish() {
        Pizza pizza = new Pizza(1, "Pizza Napolitana", 15.99);
        return pizza;
    }
}
