package com.tsekhanovich.patterns.behavioral.observer.example1;

public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
