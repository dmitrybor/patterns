package com.lineate.bench.pattern.abstractfactory.product.color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
