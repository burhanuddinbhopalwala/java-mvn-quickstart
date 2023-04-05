package org.example.patterns.gof.structural.proxy;

import java.util.List;

public class CustomerImpl implements Customer {
    @Override
    public int getId() {
        return 123;
    }

    @Override
    public List<Order> getOrders() {
        return null;
    }
}
