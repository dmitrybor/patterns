package com.lineate.bench.pattern.abstractfactory.exercise.product;

public class HollywoodActionMovie implements HollywoodMovie {
    @Override
    public void showName() {
        System.out.println("Inside HollywoodActionMovie::showName() method.");
    }
}
