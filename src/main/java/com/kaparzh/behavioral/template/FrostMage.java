package com.kaparzh.behavioral.template;

public class FrostMage extends MageTemplate {

    @Override
    protected void castElement() {
        System.out.println("Casting frostBolt");
    }
}
