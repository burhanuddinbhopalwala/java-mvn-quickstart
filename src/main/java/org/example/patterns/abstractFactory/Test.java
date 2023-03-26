package org.example.patterns.abstractFactory;

public class Test {
    public static void main(String[] args) {
        DaoFactory daoFactory = DaoProducer.create("XML");
        Dao dao = daoFactory.createDao("Emp");
        dao.save();

        daoFactory = DaoProducer.create("CSV");
        dao = daoFactory.createDao("Dept");
        dao.save();
    }
}
