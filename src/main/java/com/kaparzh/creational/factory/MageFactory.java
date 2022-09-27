package com.kaparzh.creational.factory;

public class MageFactory implements UnitFactory {

    @Override
    public Unit createUnit() {
        return new Mage();
    }
}
