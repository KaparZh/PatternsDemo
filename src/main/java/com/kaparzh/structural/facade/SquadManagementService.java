package com.kaparzh.structural.facade;

public class SquadManagementService {

    private final Infantry infantry = new Infantry();
    private final Archer archer = new Archer();
    private final Mage mage = new Mage();

    public void rest() {
        infantry.sharpen();
        archer.changeBowstring();
        mage.meditate();
    }

    public void attack() {
        infantry.attack();
        archer.attack();
        mage.castSpell();
    }
}
