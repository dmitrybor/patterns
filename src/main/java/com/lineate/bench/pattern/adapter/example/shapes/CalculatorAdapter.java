package com.lineate.bench.pattern.adapter.example.shapes;

public class CalculatorAdapter implements Calculator {
    private RectangleCalculator calculator;
    private Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
        this.calculator = new RectangleCalculator();
    }

    @Override
    public double getArea(Rectangle rectangle) {
        Rectangle r = new Rectangle(triangle.getBase(), triangle.getHeight() / 2);
        return calculator.getArea(r);
    }
}
