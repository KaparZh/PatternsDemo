package com.kaparzh.creational.factory;

public class WarriorFactory implements UnitFactory {

    @Override
    public Unit createUnit() {
        return new Warrior();
    }
}
