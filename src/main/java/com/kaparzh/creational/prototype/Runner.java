package com.kaparzh.creational.prototype;

public class Runner {

    public static void main(String[] args) {
        Unit masterUnit = new Unit(5, 10, 15);
        System.out.println(masterUnit);

        UnitFactory factory = new UnitFactory(masterUnit);
        Unit cloneUnit = factory.cloneUnit();
        cloneUnit.setWidth(4);
        System.out.println(cloneUnit);

    }
}
