package com.lineate.bench.pattern.abstractfactory.example.product.shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
