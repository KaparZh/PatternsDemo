package com.kaparzh.eugeniydemo.behavioral.observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");

        Subscriber subscriber1 = new Subscriber("Ivan Ivanov");
        Subscriber subscriber2 = new Subscriber("Sergey Sergeev");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Third java position");
        jobSite.removeVacancy("First java position");
    }
}
