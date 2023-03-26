package org.example.patterns.factory;

// Factory Method: Hides the object creation process
public class PizzaStore {
    public Pizza orderPizza(String type) {
        return PizzaFactory.createPizza(type);
    }
}
