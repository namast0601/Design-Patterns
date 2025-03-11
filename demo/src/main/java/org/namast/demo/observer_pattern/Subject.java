package org.namast.demo.observer_pattern;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}