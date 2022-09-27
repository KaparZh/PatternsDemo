package com.kaparzh.structural.decorator;

public class Infantryman implements Unit {

    @Override
    public void action() {
        System.out.println("Fighting");
    }
}
