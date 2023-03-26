package org.example.patterns.ioc;

public class CreditCardImpl implements CreditCard {
    @Override
    public void makePayment() {
        System.out.println("Payment Made!");
    }
}
