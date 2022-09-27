package com.kaparzh.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> news) {
        System.out.println(name + ", your news feed has been updated");
    }
}
