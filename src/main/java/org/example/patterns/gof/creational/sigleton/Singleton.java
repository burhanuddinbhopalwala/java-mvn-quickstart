package org.example.patterns.gof.creational.sigleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static volatile Singleton singleton;
    // volatile kw to avoid any issues in multi-threaded environment;

    // Eager initialization - Not preferred;
    static {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
    }

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    // Lazy initialization + sychronized for making this thread safe!
//    public static synchronized Singleton getSingleton() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null)
//                    singleton = new Singleton();
//            }
//        }
//        return singleton;
//    }
    // sout(Singleton.getSingleton() == Singleton.getSingleton())

    protected Object readResolve() {
        return singleton;
    }
    // To handle the serialization!


    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
// Note: Use cases: Logger +
// PropertyReader(PropertyFile) +
// JDBC DataSource connection class for managing the connection pool!