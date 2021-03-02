package com.lineate.bench.pattern.decorator.example1;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decoratorA = new ConcreteDecoratorA();
        decoratorA.setComponent(component);
        decoratorA.doJob();

        Decorator decoratorB = new ConcreteDecoratorB();
        decoratorB.setComponent(decoratorA);
        decoratorB.doJob();
    }
}
