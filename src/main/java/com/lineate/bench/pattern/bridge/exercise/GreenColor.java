package com.lineate.bench.pattern.bridge.exercise;

public class GreenColor implements Color {

    @Override
    public void fillWithColor(int borderWidth) {
        System.out.println("Filled with Green color and " + borderWidth + " inch border");
    }
}
