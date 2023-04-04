package org.example.patterns.gof.behavioral.state;

// Allows an object to alter its behavior when its integral state changes.
public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();

}