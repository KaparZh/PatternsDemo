package com.kaparzh.eugeniydemo.behavioral.visitor;

public class Database implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
