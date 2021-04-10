package com.lineate.bench.pattern.strategy.exercise;

public class Client {
    public static void main(String[] args) {
        Operation add = new AddOperation();
        Operation subtract = new SubtractOperation();
        Operation multiply = new MultiplyOperation();
        OperationContext context = new OperationContext();
        int a = 10;
        int b = 15;
        System.out.println(a + "+" + b + "=" + context.performOperation(add, a, b));
        System.out.println(a + "-" + b + "=" + context.performOperation(subtract, a, b));
        System.out.println(a + "*" + b + "=" + context.performOperation(multiply, a, b));
    }
}
