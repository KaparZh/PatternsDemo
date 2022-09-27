package com.kaparzh.eugeniydemo.creational.abstractfactory.website;

import com.kaparzh.eugeniydemo.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes code...");
    }
}
