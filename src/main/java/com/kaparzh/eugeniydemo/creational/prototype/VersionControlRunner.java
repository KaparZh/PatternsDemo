package com.kaparzh.eugeniydemo.creational.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode = new SourceCode();");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project clone = factory.cloneProject();
        System.out.println(clone);
    }
}
