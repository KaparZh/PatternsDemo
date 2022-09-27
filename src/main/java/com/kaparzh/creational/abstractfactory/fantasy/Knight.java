package com.kaparzh.creational.abstractfactory.fantasy;

import com.kaparzh.creational.abstractfactory.MeleeUnit;

public class Knight implements MeleeUnit {

    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword.");
    }
}
