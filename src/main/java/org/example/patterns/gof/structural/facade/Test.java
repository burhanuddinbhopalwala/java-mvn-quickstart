package org.example.patterns.gof.structural.facade;

public class Test {

    public static void main(String[] args) {
        new OrderFacade().createOrder("test", 1);
    }
}
