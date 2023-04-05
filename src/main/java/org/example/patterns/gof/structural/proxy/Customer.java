package org.example.patterns.gof.structural.proxy;

import java.util.List;

// Proxy = Placeholder;
// Virtual Proxy (Hibernate lazy loading using Reflection API)
// Security Proxy (Auths (Authentication + Authorizers)
// Remote Proxy (LoadBalancer + Caching + Load Distribution stuffs)
public interface Customer {
    int getId();

    List<Order> getOrders();
}
