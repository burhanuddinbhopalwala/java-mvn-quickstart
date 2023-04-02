package org.example.patterns.gof.creational.factory;

public class ChickenPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing chicken pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting chicken pizza");
    }
}
