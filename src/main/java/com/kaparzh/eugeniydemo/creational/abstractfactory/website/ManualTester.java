package com.kaparzh.eugeniydemo.creational.abstractfactory.website;

import com.kaparzh.eugeniydemo.creational.abstractfactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual tester tests code...");
    }
}
