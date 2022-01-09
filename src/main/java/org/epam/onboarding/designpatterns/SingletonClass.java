package org.epam.onboarding.designpatterns;

public class SingletonClass {

    private static SingletonClass single_instance = null;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (single_instance == null)
            single_instance = new SingletonClass();

        return single_instance;

    }
}
