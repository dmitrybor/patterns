package com.lineate.bench.pattern.bridge.exercise;

public class RedColor implements Color {
    @Override
    public void fillWithColor(int borderWidth) {
        System.out.println("Filled with Red color and " + borderWidth + " inch border");
    }
}
