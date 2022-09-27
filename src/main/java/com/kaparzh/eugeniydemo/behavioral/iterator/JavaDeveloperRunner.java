package com.kaparzh.eugeniydemo.behavioral.iterator;

public class JavaDeveloperRunner {

    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "JDBC"};

        JavaDeveloper developer = new JavaDeveloper("Kapar", skills);
        Iterator iterator = developer.getIterator();
        System.out.println("Java developer: " + developer.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
