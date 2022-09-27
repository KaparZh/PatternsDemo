package com.kaparzh.eugeniydemo.behavioral.chainofresponsibility;

public class SimpleReportNotifier extends Notifier {

    protected SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
