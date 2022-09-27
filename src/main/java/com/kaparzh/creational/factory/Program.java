package com.kaparzh.creational.factory;

public class Program {

    public static void main(String[] args) {
        UnitFactory unitFactory = FactoryProvider.createUnitFactoryByType(UnitType.Archer);
        Unit unit = unitFactory.createUnit();

        unit.attack();
        unit.defense();
    }
}
