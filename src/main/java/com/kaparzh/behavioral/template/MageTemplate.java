package com.kaparzh.behavioral.template;

public abstract class MageTemplate {

    public void castMagic() {
        System.out.println("Drink mana potion");
        castElement();
    }

    protected abstract void castElement();
}
