package com.kaparzh.behavioral.template;

public class FireMage extends MageTemplate {

    @Override
    protected void castElement() {
        System.out.println("Casting fire wall");
    }
}
