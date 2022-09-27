package com.kaparzh.eugeniydemo.creational.builder;

public class Director {
    WebsiteBuilder builder;

    Website buildWebsite() {
        return builder.createWebsite()
                .buildName()
                .buildCms()
                .buildPrice()
                .getWebsite();
    }

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }
}
