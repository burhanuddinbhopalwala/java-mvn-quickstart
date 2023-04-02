package org.example.patterns.gof.structural.decorator;

public class PlainPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Plain Pizza");
    }
}
