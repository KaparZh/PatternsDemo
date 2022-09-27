package com.kaparzh.structural.decorator;

public class Knight extends UnitDecorator {

    public Knight(Unit unit) {
        super(unit);
    }

    public void giveOrders() {
        System.out.println("Gives orders");
    }

    @Override
    public void action() {
        super.action();
        giveOrders();
    }
}
