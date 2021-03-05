package com.lineate.bench.pattern.interpreter.example;

public class IntToBinaryExpression implements Expression{
    private int intValue;

    public IntToBinaryExpression(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getBinaryFormat(intValue);
    }
}
