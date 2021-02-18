package com.lineate.bench.pattern.abstractfactory.example.product.shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
