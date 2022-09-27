package com.kaparzh.behavioral.chainofresponsibility;

public class Dollar1Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int currency) {
        System.out.println("Dispensing " + currency + " 1$ note");
    }
}
