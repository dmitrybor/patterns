package com.lineate.bench.pattern.interpreter.exercise;

public class TerminalExpression implements Expression{
    private String terminalValue;

    public TerminalExpression(String terminalValue) {
        this.terminalValue = terminalValue;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(terminalValue);
    }
}
