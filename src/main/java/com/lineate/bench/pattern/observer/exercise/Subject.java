package com.lineate.bench.pattern.observer.exercise;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
