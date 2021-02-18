package com.lineate.bench.pattern.abstractfactory.example.product.color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
