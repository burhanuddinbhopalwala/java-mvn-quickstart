package org.example.patterns.gof.creational.sigleton;

public enum SingletonEnum {
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
