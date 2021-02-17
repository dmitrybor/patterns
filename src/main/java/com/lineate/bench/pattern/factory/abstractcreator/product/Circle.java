package com.lineate.bench.pattern.factory.abstractcreator.product;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
