package com.kaparzh.behavioral.memento;

public class Character {

    private String name;
    private int level;
    private int damage;
    private int armor;

    public Character(String name, int level, int damage, int armor) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.armor = armor;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Save save() {
        return new Save(name, level, damage, armor);
    }

    public void load(Save save) {
        name = save.getName();
        level = save.getLevel();
        damage = save.getDamage();
        armor = save.getArmor();

    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", damage=" + damage +
                ", armor=" + armor +
                '}';
    }
}
