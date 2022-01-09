package org.epam.onboarding.designpatterns.singleton;

import org.epam.onboarding.designpatterns.factory.FactoryClass;
import org.epam.onboarding.designpatterns.factory.Notification;

public class SingletonClassImpl {
    public static void main(String[] args) {

        //Three SingletonClass object created

        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();
        SingletonClass z = SingletonClass.getInstance();

        if (x == y && y == z) {
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
