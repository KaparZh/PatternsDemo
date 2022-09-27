package com.kaparzh.creational.singleton;

public class ArcherHero extends Hero {

    private static ArcherHero archerHero;

    private ArcherHero() {
        super("Archer", 35, 85);
    }

    public static synchronized ArcherHero getArcherHero() {
        if (archerHero == null) {
            archerHero = new ArcherHero();
        }
        return archerHero;
    }

    @Override
    void attack(Hero hero) {
        System.out.println(this.getName() + " attacks " + hero.getName() + ", " + this.getDamage() + " damage");
        hero.takeDamage(archerHero.getDamage());
    }

    @Override
    void takeDamage(int damage) {
        int remainingHp = this.getHp() - damage;
        if (remainingHp > 0) {
            this.setHp(remainingHp);
            System.out.println("Hp: " + this.getHp());
        } else {
            System.out.println("Champion is dead!");
        }
    }
}
