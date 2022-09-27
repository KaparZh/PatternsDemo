package com.kaparzh.eugeniydemo.creational.abstractfactory.website;

import com.kaparzh.eugeniydemo.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageCode() {
        System.out.println("Website PM manages website project...");
    }
}
