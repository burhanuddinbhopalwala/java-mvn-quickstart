package org.example.patterns.gof.creational.abstractFactory;

public class XMLDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Dept to XML");
    }
}
