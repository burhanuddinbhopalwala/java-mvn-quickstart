package org.example.patterns.gof.creational.factory;

// Factory Method: Hides the object creation process
public class PizzaStore {
    public Pizza orderPizza(String type) {
        return PizzaFactory.createPizza(type);
    }
}
