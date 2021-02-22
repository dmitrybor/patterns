package com.lineate.bench.pattern.prototype.example;

public class Circle extends Shape{
    public Circle() {
        super.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
