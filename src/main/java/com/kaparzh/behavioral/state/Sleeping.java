package com.kaparzh.behavioral.state;

public class Sleeping implements Activity {

    @Override
    public void action() {
        System.out.println("Sleeping...");
    }
}
