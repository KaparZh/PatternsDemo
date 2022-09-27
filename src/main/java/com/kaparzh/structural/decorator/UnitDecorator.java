package com.kaparzh.structural.decorator;

public class UnitDecorator implements Unit {
    Unit unit;

    public UnitDecorator(Unit unit) {
        this.unit = unit;
    }

    @Override
    public void action() {
        unit.action();
    }
}
