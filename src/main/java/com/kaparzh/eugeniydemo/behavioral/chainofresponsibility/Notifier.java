package com.kaparzh.eugeniydemo.behavioral.chainofresponsibility;

public abstract class Notifier {

    private final int priority;
    private Notifier nextNotifier;

    protected Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManage(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManage(message, level);
        }
    }

    public abstract void write(String message);
}
