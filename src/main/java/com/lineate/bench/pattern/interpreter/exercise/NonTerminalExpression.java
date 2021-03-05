package com.lineate.bench.pattern.interpreter.exercise;

import java.util.function.BiFunction;

public class NonTerminalExpression implements Expression {
    private BiFunction<Boolean, Boolean, Boolean> operation;
    private Expression a;
    private Expression b;

    public NonTerminalExpression(BiFunction<Boolean, Boolean, Boolean> operation, Expression a, Expression b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean interpret(Context context) {
        return operation.apply(a.interpret(context), b.interpret(context));
    }
}
