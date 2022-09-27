package com.kaparzh.creational.abstractfactory.space;

import com.kaparzh.creational.abstractfactory.MeleeUnit;

public class StarKnight implements MeleeUnit {

    @Override
    public void attack() {
        System.out.println("Star knight attacks with light saber.");
    }
}
