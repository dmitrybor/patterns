package com.lineate.bench.pattern.memento.exercise;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(state);
    }

    @Override
    public String toString() {
        return state;
    }

    public void restore(Object object) {
        Memento memento = (Memento) object;
        this.state = memento.state;
    }

    private class Memento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }
    }
}
