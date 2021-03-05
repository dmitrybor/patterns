package com.lineate.bench.pattern.interpreter.example;

public class IntToHexExpression implements Expression{
    private int intValue;

    public IntToHexExpression(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getHexadecimalFormat(intValue);
    }
}
