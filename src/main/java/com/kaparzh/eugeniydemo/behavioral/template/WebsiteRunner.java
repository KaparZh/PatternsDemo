package com.kaparzh.eugeniydemo.behavioral.template;

public class WebsiteRunner {

    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        newsPage.showPage();
    }
}
