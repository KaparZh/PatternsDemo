package com.kaparzh.creational.factory;

public class Mage implements Unit {

    @Override
    public void attack() {
        System.out.println("Mage casts fireball");
    }

    @Override
    public void defense() {
        System.out.println("Mage casts manashield");
    }
}
