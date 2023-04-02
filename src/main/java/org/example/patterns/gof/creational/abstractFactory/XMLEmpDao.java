package org.example.patterns.gof.creational.abstractFactory;

public class XMLEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Emp to XML");
    }
}
