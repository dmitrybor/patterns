package com.lineate.bench.pattern.strategy.exercise;

public class OperationContext {
    public int performOperation(Operation operation, int a, int b) {
        return operation.perform(a, b);
    }
}
