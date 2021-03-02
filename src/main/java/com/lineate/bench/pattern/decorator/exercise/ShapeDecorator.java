package com.lineate.bench.pattern.decorator.exercise;

public class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (null != shape) {
            shape.draw();
        }
    }
}
