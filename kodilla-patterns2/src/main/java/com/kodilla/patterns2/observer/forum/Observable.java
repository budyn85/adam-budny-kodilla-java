package com.kodilla.patterns2.observer.forum;

import java.util.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
