package com.lineate.bench.pattern.observer.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Objects.isNull;

public class MyTopic implements Subject{
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = Collections.synchronizedList(new ArrayList<>());
    }

    @Override
    public void register(Observer observer) {
        if (isNull(observer)) {
            throw new NullPointerException("Null Observer");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (changed) {
           observers.forEach(Observer::update);
           changed = false;
        }
    }

    @Override
    public Object getUpdate() {
        return message;
    }

    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
