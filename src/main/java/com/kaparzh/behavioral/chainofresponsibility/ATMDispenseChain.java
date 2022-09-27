package com.kaparzh.behavioral.chainofresponsibility;

public class ATMDispenseChain {

    public static void main(String[] args) {
        DispenseChain dispenser1 = new Dollar50Dispenser();
        DispenseChain dispenser2 = new Dollar20Dispenser();
        DispenseChain dispenser3 = new Dollar10Dispenser();
        DispenseChain dispenser4 = new Dollar1Dispenser();

        dispenser1.setNextChain(dispenser2);
        dispenser2.setNextChain(dispenser3);
        dispenser3.setNextChain(dispenser4);

        dispenser1.dispense(174);
    }
}
