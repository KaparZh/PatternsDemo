package com.kaparzh.behavioral.observer;

public class Runner {

    public static void main(String[] args) {
        NewsChannel newsChannel = new NewsChannel();

        newsChannel.addNews("Finance");
        newsChannel.addNews("IT");

        Subscriber subscriber1 = new Subscriber("Ivan");
        Subscriber subscriber2 = new Subscriber("Sergey");

        newsChannel.addObserver(subscriber1);
        newsChannel.addObserver(subscriber2);

        newsChannel.addNews("Sport");
        newsChannel.removeNews("IT");
    }
}
