package com.lineate.bench.pattern.prototype.example;

public class Square extends Shape {
    public Square() {
        super.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
