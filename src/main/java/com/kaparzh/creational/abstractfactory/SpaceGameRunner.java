package com.kaparzh.creational.abstractfactory;

import com.kaparzh.creational.abstractfactory.space.SpaceUnitFactory;

public class SpaceGameRunner {

    public static void main(String[] args) {
        UnitFactory unitFactory = new SpaceUnitFactory();
        MeleeUnit meleeUnit = unitFactory.createMeleeUnit();
        RangeUnit rangeUnit = unitFactory.createRangeUnit();

        meleeUnit.attack();
        rangeUnit.attack();
    }
}
