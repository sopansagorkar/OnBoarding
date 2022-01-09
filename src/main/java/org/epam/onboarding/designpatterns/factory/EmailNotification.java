package org.epam.onboarding.designpatterns.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notifications");
    }
}
