package com.kaparzh.structural.flyweight;

public class Archer implements Unit {

    @Override
    public void attack() {
        System.out.println("Archer shoots with a bow");
    }
}
