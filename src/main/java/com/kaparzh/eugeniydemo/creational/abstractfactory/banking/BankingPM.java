package com.kaparzh.eugeniydemo.creational.abstractfactory.banking;

import com.kaparzh.eugeniydemo.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageCode() {
        System.out.println("Banking PM manage banking projects...");
    }
}
