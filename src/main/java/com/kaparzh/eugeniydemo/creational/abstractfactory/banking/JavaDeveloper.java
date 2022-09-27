package com.kaparzh.eugeniydemo.creational.abstractfactory.banking;

import com.kaparzh.eugeniydemo.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
