package com.kaparzh.eugeniydemo.behavioral.chainofresponsibility;

public class SMSNotifier extends Notifier {

    protected SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
