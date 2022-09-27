package com.kaparzh.behavioral.chainofresponsibility;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int currency) {
        if (currency >= 10) {
            int num = currency / 10;
            int remainder = currency % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder != 0) {
                chain.dispense(remainder);
            }
        } else {
            chain.dispense(currency);
        }
    }
}
