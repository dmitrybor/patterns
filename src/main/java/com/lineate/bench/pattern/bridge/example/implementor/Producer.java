package com.lineate.bench.pattern.bridge.example.implementor;

public class Producer extends Workshop {
    @Override
    public void work() {
        System.out.println("Produce");
    }
}
