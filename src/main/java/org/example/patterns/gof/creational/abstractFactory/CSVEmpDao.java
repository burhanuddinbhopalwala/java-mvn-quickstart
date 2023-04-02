package org.example.patterns.gof.creational.abstractFactory;

public class CSVEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Emp to CSV");
    }
}
