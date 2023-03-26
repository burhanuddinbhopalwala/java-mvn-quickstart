package org.example.patterns.abstractFactory;

public class CSVEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Emp to CSV");
    }
}
