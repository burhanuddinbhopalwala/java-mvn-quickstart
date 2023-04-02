package org.example.patterns.gof.structural.decorator;

public class PizzaDecorator implements Pizza {
    private final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        this.pizza.bake();
    }
}
