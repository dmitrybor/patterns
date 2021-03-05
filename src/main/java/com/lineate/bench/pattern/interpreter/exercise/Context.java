package com.lineate.bench.pattern.interpreter.exercise;

public class Context {
    private String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String str) {
        return input.toLowerCase().contains(str.toLowerCase());
    }

    public String getInput() {
        return input;
    }
}
