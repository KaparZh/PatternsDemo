package com.kaparzh.creational.factory;

public class Warrior implements Unit {

    @Override
    public void attack() {
        System.out.println("Warrior strikes with a sword.");
    }

    @Override
    public void defense() {
        System.out.println("Warrior blocks with shield.");
    }
}
