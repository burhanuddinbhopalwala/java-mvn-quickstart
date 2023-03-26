package org.example.patterns.facade;

public class OrderProcessor {
    public boolean checkStock(String name, int quantity) {
        System.out.println("Checking stock");
        return true;
    }

    public int processOrder(String name, int quantity) {
        System.out.println("Processing order");
        return 123;
    }


    public boolean shipOrder(int orderId) {
        System.out.println("Shipping order");
        return true;
    }

}
