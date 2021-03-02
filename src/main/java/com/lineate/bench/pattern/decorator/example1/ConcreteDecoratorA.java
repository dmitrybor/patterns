package com.lineate.bench.pattern.decorator.example1;

public class ConcreteDecoratorA extends Decorator {

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("I am explicitly from Decorator A");
    }
}
