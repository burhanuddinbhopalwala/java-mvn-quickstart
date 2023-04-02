package org.example.patterns.gof.creational.abstractFactory;

public class XMLDaoFactory extends DaoFactory {
    @Override
    public Dao createDao(String type) {
        if (type.equals("Emp"))
            return new XMLEmpDao();
        else if (type.equals("Dept"))
            return new XMLDeptDao();
        else
            throw new IllegalArgumentException();
    }
}
