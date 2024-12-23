package org.example.factory;

import org.example.model.Dish;

/**
 * @author Manuel Aguilera / @aguileradev
 */
//Paso 2 Definir los productos concretos
public class Hamburger extends Dish {

    public Hamburger(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Hamburger() {
    }

    @Override
    public void prepare() {
        System.out.println("Cocinando la carne y montando la hamburguesa");
    }

    @Override
    public void serve() {
        System.out.println("Se esta sirviendo la hamburguesa con papas fritas...");
    }
}
