package com.kaparzh.creational.singleton;

public class GameArenaRunner {

    public static void main(String[] args) {
        Hero mage = MageHero.getMageHero();
        Hero warrior = WarriorHero.getWarriorHero();
        Hero archer = ArcherHero.getArcherHero();

        mage.attack(warrior);
        archer.attack(mage);
        warrior.attack(mage);
    }
}
