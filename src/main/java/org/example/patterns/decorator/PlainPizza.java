package org.example.patterns.decorator;

public class PlainPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Plain Pizza");
    }
}
