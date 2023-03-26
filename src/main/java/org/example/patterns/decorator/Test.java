package org.example.patterns.decorator;

public class Test {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        plainPizza.bake(); //  Plain Pizza

        Pizza loadedPizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        loadedPizza.bake();
        // Plain Pizza
        // Added Cheese Topping...
        // Added Veggie Topping...

    }
}

