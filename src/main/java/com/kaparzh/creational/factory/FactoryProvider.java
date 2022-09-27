package com.kaparzh.creational.factory;

public class FactoryProvider {

    static UnitFactory createUnitFactoryByType(UnitType unitType) {
        switch (unitType) {
            case Warrior:
                return new WarriorFactory();
            case Archer:
                return new ArcherFactory();
            case Mage:
                return new MageFactory();
            default:
                throw new RuntimeException(unitType + " is unknown!");
        }
    }
}
