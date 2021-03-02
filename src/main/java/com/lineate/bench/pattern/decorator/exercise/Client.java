package com.lineate.bench.pattern.decorator.exercise;

public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        ShapeDecorator redFilledCircle = new FilledShapeDecorator(redCircle);
        redFilledCircle.draw();

        Shape rectangle = new Rectangle();
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
    }
}
