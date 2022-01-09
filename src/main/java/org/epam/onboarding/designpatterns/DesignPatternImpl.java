package org.epam.onboarding.designpatterns;

public class DesignPatternImpl {
    public static void main(String[] args) {

        //Three SingletonClass object created

        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();
        SingletonClass z = SingletonClass.getInstance();

        //Factory Object Creation

        FactoryClass factoryClass=new FactoryClass();
        Notification notification=factoryClass.createNotification("EMAIL");
        notification.notifyUser();


        if (x == y && y == z) {
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
