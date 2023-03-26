package org.example.patterns.abstractFactory;

public class XMLDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Dept to XML");
    }
}
