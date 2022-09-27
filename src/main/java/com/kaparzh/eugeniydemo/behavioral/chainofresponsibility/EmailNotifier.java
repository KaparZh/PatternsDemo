package com.kaparzh.eugeniydemo.behavioral.chainofresponsibility;

public class EmailNotifier extends Notifier {

    protected EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
