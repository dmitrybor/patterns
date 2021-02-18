package com.lineate.bench.pattern.abstractfactory.example.product.color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
