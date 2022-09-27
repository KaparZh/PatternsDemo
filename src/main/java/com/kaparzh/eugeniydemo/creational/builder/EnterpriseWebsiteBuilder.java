package com.kaparzh.eugeniydemo.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    WebsiteBuilder buildName() {
        website.setName("Enterprise website");
        return this;
    }

    @Override
    WebsiteBuilder buildCms() {
        website.setCms(Cms.ALIFRESCO);
        return this;
    }

    @Override
    WebsiteBuilder buildPrice() {
        website.setPrice(10000);
        return this;
    }
}
