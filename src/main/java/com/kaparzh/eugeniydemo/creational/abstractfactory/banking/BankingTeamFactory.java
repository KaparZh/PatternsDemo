package com.kaparzh.eugeniydemo.creational.abstractfactory.banking;

import com.kaparzh.eugeniydemo.creational.abstractfactory.Developer;
import com.kaparzh.eugeniydemo.creational.abstractfactory.ProjectManager;
import com.kaparzh.eugeniydemo.creational.abstractfactory.ProjectTeamFactory;
import com.kaparzh.eugeniydemo.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
