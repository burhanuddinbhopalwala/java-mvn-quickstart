package org.example.patterns.gof.structural.decorator;

public class CheesePizzaDecorator extends PizzaDecorator {
    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Added Cheese Topping...");
    }
}
