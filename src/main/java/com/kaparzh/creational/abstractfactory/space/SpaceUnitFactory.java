package com.kaparzh.creational.abstractfactory.space;

import com.kaparzh.creational.abstractfactory.MeleeUnit;
import com.kaparzh.creational.abstractfactory.RangeUnit;
import com.kaparzh.creational.abstractfactory.UnitFactory;

public class SpaceUnitFactory implements UnitFactory {

    @Override
    public MeleeUnit createMeleeUnit() {
        return new StarKnight();
    }

    @Override
    public RangeUnit createRangeUnit() {
        return new SpaceMarine();
    }
}
