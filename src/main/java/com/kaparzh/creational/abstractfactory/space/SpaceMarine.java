package com.kaparzh.creational.abstractfactory.space;

import com.kaparzh.creational.abstractfactory.RangeUnit;

public class SpaceMarine implements RangeUnit {

    @Override
    public void attack() {
        System.out.println("Space marine shoots a laser rifle.");
    }
}
