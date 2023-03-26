package org.example.patterns.facade;

public class OrderFacade {
    OrderProcessor orderProcessor = new OrderProcessor();

    public boolean createOrder(String name, int quantity) {
        if (orderProcessor.checkStock(name, quantity))
            return orderProcessor.shipOrder(orderProcessor.processOrder(name, quantity));
        return false;
    }
}
