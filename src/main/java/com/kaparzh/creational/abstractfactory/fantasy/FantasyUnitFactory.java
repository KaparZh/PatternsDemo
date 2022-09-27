package com.kaparzh.creational.abstractfactory.fantasy;

import com.kaparzh.creational.abstractfactory.MeleeUnit;
import com.kaparzh.creational.abstractfactory.RangeUnit;
import com.kaparzh.creational.abstractfactory.UnitFactory;

public class FantasyUnitFactory implements UnitFactory {

    @Override
    public MeleeUnit createMeleeUnit() {
        return new Knight();
    }

    @Override
    public RangeUnit createRangeUnit() {
        return new Archer();
    }
}
