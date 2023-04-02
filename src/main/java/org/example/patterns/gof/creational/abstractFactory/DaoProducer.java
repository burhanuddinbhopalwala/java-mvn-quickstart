package org.example.patterns.gof.creational.abstractFactory;

public class DaoProducer {
    public static DaoFactory create(String type) {
        if (type.equals("XML"))
            return new XMLDaoFactory();
        else if (type.equals("CSV"))
            return new CSVDaoFactory();
        else
            throw new IllegalArgumentException();
    }
}
