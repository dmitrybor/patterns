package com.lineate.bench.pattern.adapter.example.shapes;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 10);
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter(triangle);
        System.out.println("Triangle area: " + calculatorAdapter.getArea(null));
    }
}
