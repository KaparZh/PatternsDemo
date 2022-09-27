package com.kaparzh.behavioral.chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int currency) {
        if (currency >= 20) {
            int num = currency / 20;
            int remainder = currency % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) {
                chain.dispense(remainder);
            }
        } else {
            chain.dispense(currency);
        }
    }
}
