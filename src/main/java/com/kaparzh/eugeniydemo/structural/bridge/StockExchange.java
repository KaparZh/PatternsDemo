package com.kaparzh.eugeniydemo.structural.bridge;

public class StockExchange extends Program{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange system in progress...");
        developer.writeCode();
    }
}
