package com.kaparzh.creational.factory;

public class Archer implements Unit {

    @Override
    public void attack() {
        System.out.println("Archer shoots his bow");
    }

    @Override
    public void defense() {
        System.out.println("Archer running away");
    }
}
