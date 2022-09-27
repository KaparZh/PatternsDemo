package com.kaparzh.eugeniydemo.creational.abstractfactory.website;

import com.kaparzh.eugeniydemo.creational.abstractfactory.Developer;
import com.kaparzh.eugeniydemo.creational.abstractfactory.ProjectManager;
import com.kaparzh.eugeniydemo.creational.abstractfactory.ProjectTeamFactory;
import com.kaparzh.eugeniydemo.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
