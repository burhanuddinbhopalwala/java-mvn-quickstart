package org.example.patterns.facade;

import org.example.patterns.factory.PizzaStore;

public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("Veggie");
        pizzaStore.orderPizza("Chicken");
        pizzaStore.orderPizza("Cheese");
    }
}
