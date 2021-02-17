package com.lineate.bench.pattern.factory.abstractcreator.product;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
