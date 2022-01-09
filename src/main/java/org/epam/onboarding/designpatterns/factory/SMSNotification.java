package org.epam.onboarding.designpatterns.factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notifications");
    }
}
