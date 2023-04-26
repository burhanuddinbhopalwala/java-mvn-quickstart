package org.example.patterns.gof.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {
    // has a CustomerImpl()
    Customer customerImpl = new CustomerImpl();

    public CustomerProxyImpl(Customer customerImpl) {
        this.customerImpl = customerImpl;
    }

    private Order createOrder(int id, String name, int quantity) {
        Order order = new Order();
        order.setId(id);
        order.setProductName(name);
        order.setProductQuantity(quantity);
        return order;
    }

    @Override
    public int getId() {
        return customerImpl.getId();
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(createOrder(1, "test1", 1));
        orders.add(createOrder(2, "test2", 2));
        orders.add(createOrder(3, "test3", 3));
        return orders;
    }
}
