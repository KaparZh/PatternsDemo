package com.kaparzh.eugeniydemo.creational.abstractfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
