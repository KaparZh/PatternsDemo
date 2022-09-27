package com.kaparzh.creational.prototype;

public class UnitFactory {
    Unit unit;

    public UnitFactory(Unit unit) {
        this.unit = unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    Unit cloneUnit() {
        return (Unit) unit.copy();
    }
}
