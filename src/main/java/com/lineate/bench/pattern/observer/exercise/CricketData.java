package com.lineate.bench.pattern.observer.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketData implements Subject{
    private int runs = 0;
    private int wickets = 0;
    private int overs = 0;
    private boolean changed = false;

    private List<Observer> observers;

    public CricketData() {
        observers = Collections.synchronizedList(new ArrayList<>());
    }

    @Override
    public void register(Observer observer) {
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
            observers.forEach(o -> o.update(runs, wickets, overs));
        }
        changed = false;
    }

    public void dataChanged(int runs, int wickets, int overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.changed = true;
        notifyObservers();
    }
}
