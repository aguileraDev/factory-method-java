package org.example.factory.creator;

import org.example.factory.ChocolateCake;
import org.example.model.Dish;

/**
 * @author Manuel Aguilera / @aguileradev
 */
// Paso 4 Definir los fabricantes concretos
public class ChefChocolateCake extends Chef {
    @Override
    public Dish prepareDish() {
        return new ChocolateCake(3, "pastel de chocolate", 5.0);
    }
}
