package org.example.factory;

import org.example.model.Dish;

/**
 * @author Manuel Aguilera / @aguileradev
 */
//Paso 2 Definir los productos concretos
public class Pizza extends Dish  {
    public Pizza(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Pizza(){}

    @Override
    public void prepare() {
        System.out.println("Preparando la masa agregando mucha salsa y queso.");
    }

    @Override
    public void serve() {
        System.out.println("Sirviendo pizza extragrande...");
    }

}
