package com.lineate.bench.pattern.state.exercise;

public class VibrationModeState implements AlertModeState{
    @Override
    public void alert() {
        System.out.println("vibration...");
    }
}
