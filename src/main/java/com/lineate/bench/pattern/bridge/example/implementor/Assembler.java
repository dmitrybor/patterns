package com.lineate.bench.pattern.bridge.example.implementor;

public class Assembler extends Workshop {
    @Override
    public void work() {
        System.out.println("Assemble");
    }
}
