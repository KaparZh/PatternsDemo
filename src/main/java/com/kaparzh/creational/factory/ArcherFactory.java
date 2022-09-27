package com.kaparzh.creational.factory;

public class ArcherFactory implements UnitFactory {

    @Override
    public Unit createUnit() {
        return new Archer();
    }
}
