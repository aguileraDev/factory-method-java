package org.example.factory.creator;

import org.example.model.Dish;

/**
 * @author Manuel Aguilera / @aguileradev
 */
//Paso 3 Definir el creador abstracto (fabricante)
public abstract class Chef {

    public abstract Dish prepareDish(); // Nuestro factory method
}
