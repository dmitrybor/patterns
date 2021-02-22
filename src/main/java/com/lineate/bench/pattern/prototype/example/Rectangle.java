package com.lineate.bench.pattern.prototype.example;

public class Rectangle extends Shape {

    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
