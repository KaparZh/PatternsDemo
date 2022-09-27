package com.kaparzh.creational.abstractfactory;

import com.kaparzh.creational.abstractfactory.fantasy.FantasyUnitFactory;

public class FantasyGameRunner {

    public static void main(String[] args) {
        UnitFactory unitFactory = new FantasyUnitFactory();
        MeleeUnit meleeUnit = unitFactory.createMeleeUnit();
        RangeUnit rangeUnit = unitFactory.createRangeUnit();

        meleeUnit.attack();
        rangeUnit.attack();
    }
}
