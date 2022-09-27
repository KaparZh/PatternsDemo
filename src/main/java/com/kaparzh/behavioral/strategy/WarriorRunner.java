package com.kaparzh.behavioral.strategy;

public class WarriorRunner {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.setActivity(new Sleeping());
        warrior.executeActivity();

        warrior.setActivity(new Marching());
        warrior.executeActivity();
    }
}
