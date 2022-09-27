package com.kaparzh.creational.abstractfactory.fantasy;

import com.kaparzh.creational.abstractfactory.RangeUnit;

public class Archer implements RangeUnit {

    @Override
    public void attack() {
        System.out.println("Archer shoots a bow.");
    }
}
