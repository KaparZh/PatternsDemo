package com.kaparzh.structural.decorator;

public class BattleRunner {

    public static void main(String[] args) {
        Unit unit = new General(new Knight(new Infantryman()));
        unit.action();
    }
}
