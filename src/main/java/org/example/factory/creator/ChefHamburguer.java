package org.example.factory.creator;

import org.example.factory.Hamburger;
import org.example.model.Dish;

/**
 * @author Manuel Aguilera / @aguileradev
 */
// Paso 4 Definir los fabricantes concretos
public class ChefHamburguer extends Chef {
    @Override
    public Dish prepareDish() {
        return new Hamburger(2,"Hamburguesa Doble carne y queso", 15.99);
    }
}
