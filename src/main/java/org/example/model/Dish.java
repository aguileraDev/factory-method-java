package org.example.model;



/**
 * @author Manuel Aguilera / @aguileradev
 */

//Paso 1 definir producto concreto (clase abstracta o interfaz)
public abstract class Dish {
    private Integer id;
    private String name;
    private Double price;

    public Dish(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Dish() {
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Dish -> " +
                "id= " + id +
                ", name= " + name + " " +
                ", price= " + price + "\n";
    }


    public abstract void prepare();

    public abstract void serve();
}
