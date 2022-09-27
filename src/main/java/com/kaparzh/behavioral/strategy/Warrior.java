package com.kaparzh.behavioral.strategy;

public class Warrior {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.action();
    }
}
