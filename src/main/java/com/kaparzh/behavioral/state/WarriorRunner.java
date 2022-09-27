package com.kaparzh.behavioral.state;

public class WarriorRunner {

    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Warrior warrior = new Warrior();

        warrior.setActivity(activity);
        for (int i = 0; i < 5; i++) {
            warrior.action();
            warrior.changeActivity();
        }
    }
}
