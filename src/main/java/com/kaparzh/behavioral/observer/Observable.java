package com.kaparzh.behavioral.observer;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
