package org.example.patterns.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza p = null;
        if (type.equals("Veggie"))
            p = new VeggiePizza();
        else if (type.equals("Chicken"))
            p = new ChickenPizza();
        else
            throw new IllegalArgumentException();

        p.prepare();
        p.bake();
        p.cut();

        return p;
    }
}
