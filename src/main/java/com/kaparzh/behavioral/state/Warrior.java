package com.kaparzh.behavioral.state;

public class Warrior {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Marching());
        } else if (activity instanceof Marching) {
            setActivity(new Sleeping());
        }
    }

    public void action() {
        activity.action();
    }
}
