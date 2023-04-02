package org.example.patterns.gof.creational.abstractFactory;

public class CSVDaoFactory extends DaoFactory {
    @Override
    public Dao createDao(String type) {
        if (type.equals("Emp"))
            return new CSVEmpDao();
        else if (type.equals("Dept"))
            return new CSVDeptDao();
        else
            throw new IllegalArgumentException();
    }
}
