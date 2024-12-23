package org.example.factory;


import org.example.model.Dish;

/**
 * @author Manuel Aguilera / @aguileradev
 */

//Paso 2 Definir los productos concretos
public class ChocolateCake extends Dish {

    public ChocolateCake(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public ChocolateCake() {
    }

    @Override
    public void prepare() {
        System.out.println("Mezclando chocolate con crema base...");
    }

    @Override
    public void serve() {
        System.out.println("Sirviendo pastel de chocolate...");

    }
}
