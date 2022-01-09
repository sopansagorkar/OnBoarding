package org.epam.onboarding.designpatterns.factory;

import org.epam.onboarding.designpatterns.factory.EmailNotification;
import org.epam.onboarding.designpatterns.factory.Notification;
import org.epam.onboarding.designpatterns.factory.PushNotification;
import org.epam.onboarding.designpatterns.factory.SMSNotification;

public class FactoryClass {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("SMS".equals(channel)) {
            return new SMSNotification();
        }
        else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        }
        else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}
