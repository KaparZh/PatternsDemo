package com.kaparzh.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Observable {

    private final List<String> news = new ArrayList<>();

    private final List<Observer> subscribers = new ArrayList<>();

    public void addNews(String newPost) {
        news.add(newPost);
        notifyObservers();
    }

    public void removeNews(String newPost) {
        news.remove(newPost);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(subscriber -> subscriber.update(news));
    }
}
