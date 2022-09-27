package com.kaparzh.structural.decorator;

public class General extends UnitDecorator {

    public General(Unit unit) {
        super(unit);
    }

    public void developStrategy() {
        System.out.println("Develops a strategy");
    }

    @Override
    public void action() {
        super.action();
        developStrategy();
    }
}
