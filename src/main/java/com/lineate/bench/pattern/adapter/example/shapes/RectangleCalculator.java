package com.lineate.bench.pattern.adapter.example.shapes;

public class RectangleCalculator implements Calculator {
    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }
}
