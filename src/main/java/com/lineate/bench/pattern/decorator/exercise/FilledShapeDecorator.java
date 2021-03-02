package com.lineate.bench.pattern.decorator.exercise;

public class FilledShapeDecorator extends ShapeDecorator{

    public FilledShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Filling shape");
    }
}
