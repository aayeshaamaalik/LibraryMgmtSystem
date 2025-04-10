package org.example;

// SmsNotification.java
public class SmsNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
