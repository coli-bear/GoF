package com.colibear.create.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.INSTANCE;

        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        Constructor<?> constructor = Arrays.stream(declaredConstructors).findFirst().get();
        constructor.setAccessible(true);
        Settings settings1 = (Settings) constructor.newInstance();

        System.out.println("(settings == settings1) = " + (settings == settings1));

    }
}
