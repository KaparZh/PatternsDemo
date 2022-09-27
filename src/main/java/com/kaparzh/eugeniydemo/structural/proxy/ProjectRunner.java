package com.kaparzh.eugeniydemo.structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.Github.com");
        project.run();
    }
}
