package com.lineate.bench.pattern.abstractfactory.exercise.product;

public class BollywoodActionMovie implements BollywoodMovie {
    @Override
    public void showName() {
        System.out.println("Inside BollywoodActionMovie::showName() method.");
    }
}
