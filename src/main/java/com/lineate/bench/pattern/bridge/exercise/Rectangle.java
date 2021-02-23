package com.lineate.bench.pattern.bridge.exercise;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Draw Rectangle ");
        color.fillWithColor(borderWidth);
    }

    @Override
    public void modifyBorder(int borderWidth) {
        this.borderWidth = borderWidth;
    }
}
