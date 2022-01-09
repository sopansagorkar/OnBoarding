package org.epam.onboarding.designpatterns.factory;

public class FactoryClassImpl {

    public static void main(String[] args) {
        //Factory Object Creation

        FactoryClass factoryClass = new FactoryClass();
        Notification notification = factoryClass.createNotification("EMAIL");
        notification.notifyUser();
    }
}
