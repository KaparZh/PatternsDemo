package com.kaparzh.eugeniydemo.creational.abstractfactory;

import com.kaparzh.eugeniydemo.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSite {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Tester tester = projectTeamFactory.getTester();

        developer.writeCode();
        tester.testCode();
        projectManager.manageCode();
    }
}
