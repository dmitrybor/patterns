package com.lineate.bench.pattern.strategy.exercise;

public class MultiplyOperation implements Operation {
    @Override
    public int perform(int a, int b) {
        return a * b;
    }
}
