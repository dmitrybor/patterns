package com.lineate.bench.pattern.memento.exercise;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Object> savedStates;

    public CareTaker() {
        this.savedStates = new ArrayList<>();
    }

    public void save(Originator originator) {
        savedStates.add(originator.save());
    }

    public void restore(Originator originator, int savedStateIndex) {
        if (savedStates.size() > savedStateIndex) {
            originator.restore(savedStates.get(savedStateIndex));
        }
    }
}
