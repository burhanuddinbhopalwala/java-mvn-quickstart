package org.example.patterns.sigleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);

        // breaking using java reflection API => Enum solution
        final Constructor[] declaredConstructors = Singleton.class.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            s2 = (Singleton) constructor.newInstance();
            break;
        }
        System.out.println(s1 == s2);

        // Enum solution - As there are no constructors so not able break via Reflection API
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        singletonEnum.setName("test1");
        System.out.println(singletonEnum.getName()); // test1
        System.out.println(Objects.equals(singletonEnum.getName(), singletonEnum2.getName())); // true
    }
}
