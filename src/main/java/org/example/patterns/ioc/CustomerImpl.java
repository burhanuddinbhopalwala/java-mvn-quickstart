package org.example.patterns.ioc;

public class CustomerImpl implements Customer {
    // Customer has a CreditCard!
    // @Inject - Field level IOC for Object creation
    // Dependency Injection - To avoid this:  CreditCard creditCard = new CreditCard();
    CreditCard creditCard;

    // @Inject - Constructor level IOC for Object creation
    public CustomerImpl(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay() {
        creditCard.makePayment();
    }

    // @Inject - Setter method level IOC for Object creation
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
