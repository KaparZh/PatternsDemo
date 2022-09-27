package com.kaparzh.behavioral.chainofresponsibility;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int currency) {
        if (currency >= 50) {
            int num = currency / 50;
            int remainder = currency % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                chain.dispense(remainder);
            }
        } else {
            chain.dispense(currency);
        }
    }
}
