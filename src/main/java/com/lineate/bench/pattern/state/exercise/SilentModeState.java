package com.lineate.bench.pattern.state.exercise;

public class SilentModeState implements AlertModeState {
    @Override
    public void alert() {
        System.out.println("silent...");
    }
}
