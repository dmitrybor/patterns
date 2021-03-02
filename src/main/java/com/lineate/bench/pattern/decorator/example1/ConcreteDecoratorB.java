package com.lineate.bench.pattern.decorator.example1;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void doJob() {
        System.out.println("***Start Decorator B job***");
        super.doJob();
        System.out.println("I am explicitly from Decorator B");
        System.out.println("***End Decorator B job***");
    }
}
