package org.example.patterns.abstractFactory;

abstract class DaoFactory {
    abstract Dao createDao(String type);
}
