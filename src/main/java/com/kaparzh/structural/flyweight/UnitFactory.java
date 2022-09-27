package com.kaparzh.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnitFactory {

    private static final Map<String, Unit> units = new HashMap<>();

    public Unit getUnitsBySpeciality(String speciality) {
        Unit unit = units.get(speciality);
        if (unit == null) {
            switch (speciality) {
                case "archer":
                    System.out.println("Recruit archer");
                    unit = new Archer();
                    break;
                case "knight":
                    System.out.println("Recruit knight");
                    unit = new Knight();
                    break;
            }
            units.put(speciality, unit);
        }
        return unit;
    }
}
