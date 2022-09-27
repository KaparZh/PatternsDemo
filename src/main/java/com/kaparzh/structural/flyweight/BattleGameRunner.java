package com.kaparzh.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BattleGameRunner {

    public static void main(String[] args) {
        UnitFactory unitFactory = new UnitFactory();

        List<Unit> units = new ArrayList<>();

        units.add(unitFactory.getUnitsBySpeciality("archer"));
        units.add(unitFactory.getUnitsBySpeciality("archer"));
        units.add(unitFactory.getUnitsBySpeciality("archer"));
        units.add(unitFactory.getUnitsBySpeciality("archer"));
        units.add(unitFactory.getUnitsBySpeciality("knight"));
        units.add(unitFactory.getUnitsBySpeciality("knight"));
        units.add(unitFactory.getUnitsBySpeciality("knight"));
        units.add(unitFactory.getUnitsBySpeciality("knight"));

        for (Unit unit : units) {
            unit.attack();
        }
    }
}
