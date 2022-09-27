package com.kaparzh.creational.singleton;

public class WarriorHero extends Hero {

    private static WarriorHero warriorHero;

    private WarriorHero() {
        super("Warrior",30, 100);
    }

    public static synchronized WarriorHero getWarriorHero() {
        if (warriorHero == null) {
            warriorHero = new WarriorHero();
        }
        return warriorHero;
    }

    @Override
    void attack(Hero hero) {
        System.out.println(this.getName() + " attacks " + hero.getName() + ", " + this.getDamage() + " damage");
        hero.takeDamage(warriorHero.getDamage());
    }

    @Override
    void takeDamage(int damage) {
        int remainingHp = this.getHp() - damage;
        if (remainingHp > 0) {
            warriorHero.setHp(remainingHp);
            System.out.println("Hp remaining " + this.getHp());
        } else {
            System.out.println("Champion is dead!");
        }
    }
}
