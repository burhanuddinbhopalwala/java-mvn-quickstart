package org.example.patterns.gof.structural.facade;

import org.example.patterns.gof.creational.factory.PizzaStore;

public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("Veggie");
        pizzaStore.orderPizza("Chicken");
        pizzaStore.orderPizza("Cheese");
    }
}
