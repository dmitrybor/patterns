package com.lineate.bench.pattern.abstractfactory.example.product.color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
