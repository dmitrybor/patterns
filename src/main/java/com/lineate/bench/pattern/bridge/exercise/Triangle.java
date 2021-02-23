package com.lineate.bench.pattern.bridge.exercise;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Draw Triangle ");
        color.fillWithColor(borderWidth);
    }

    @Override
    public void modifyBorder(int borderWidth) {
        this.borderWidth = borderWidth;
    }
}
