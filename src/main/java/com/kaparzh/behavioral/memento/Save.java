package com.kaparzh.behavioral.memento;

public class Save {

    private final String name;
    private final int level;
    private final int damage;
    private final int armor;

    public Save(String name, int level, int damage, int armor) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.armor = armor;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }
}
