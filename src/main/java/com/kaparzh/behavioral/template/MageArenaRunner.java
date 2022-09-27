package com.kaparzh.behavioral.template;

public class MageArenaRunner {

    public static void main(String[] args) {
        MageTemplate frostMage = new FrostMage();
        MageTemplate fireMage = new FireMage();

        frostMage.castMagic();
        fireMage.castMagic();
    }
}
