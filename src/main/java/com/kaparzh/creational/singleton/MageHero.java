package com.kaparzh.creational.singleton;

public class MageHero extends Hero {

    private static MageHero mageHero;

    private MageHero() {
        super("Mage", 40, 75);
    }

    public static synchronized MageHero getMageHero() {
        if (mageHero == null) {
            mageHero = new MageHero();
        }
        return mageHero;
    }

    @Override
    void attack(Hero hero) {
        System.out.println(this.getName() + " attacks " + hero.getName() + ", " + this.getDamage() + " damage");
        hero.takeDamage(mageHero.getDamage());
    }

    @Override
    void takeDamage(int damage) {
        int remainingHp = this.getHp() - damage;
        if (remainingHp > 0) {
            mageHero.setHp(remainingHp);
            System.out.println("Hp remaining " + this.getHp());
        } else {
            System.out.println("Champion is dead!");
        }
    }
}
