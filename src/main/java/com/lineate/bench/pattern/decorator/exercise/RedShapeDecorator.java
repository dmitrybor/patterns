package com.lineate.bench.pattern.decorator.exercise;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Set pen color to RED");
        super.draw();
    }
}
