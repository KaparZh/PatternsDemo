package com.kaparzh.behavioral.chainofresponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(int currency);
}
