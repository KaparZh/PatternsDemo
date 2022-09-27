package com.kaparzh.creational.singleton;

public abstract class Hero {

    private String name;
    private int damage;
    private int hp;

    protected Hero(String name, int damage, int hp) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    abstract void attack(Hero hero);

    abstract void takeDamage(int damage);

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
