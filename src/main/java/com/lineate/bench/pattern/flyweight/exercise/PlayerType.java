package com.lineate.bench.pattern.flyweight.exercise;

public enum PlayerType {
    TERRORIST("Terrorist"),
    COUNTER_TERRORIST("Counter Terrorist");

    private String name;

    PlayerType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
