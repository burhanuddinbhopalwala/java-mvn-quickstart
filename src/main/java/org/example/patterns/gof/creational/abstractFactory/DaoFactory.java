package org.example.patterns.gof.creational.abstractFactory;

abstract class DaoFactory {
    abstract Dao createDao(String type);
}
