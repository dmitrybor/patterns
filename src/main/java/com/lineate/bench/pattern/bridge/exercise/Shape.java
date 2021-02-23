package com.lineate.bench.pattern.bridge.exercise;

public abstract class Shape {
    protected Color color;
    protected int borderWidth = 1;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
    public abstract void modifyBorder(int borderWidth);

    public int getBorderWidth() {
        return borderWidth;
    }
}
