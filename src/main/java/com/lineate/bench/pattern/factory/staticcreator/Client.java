package com.lineate.bench.pattern.factory.staticcreator;

import com.lineate.bench.pattern.factory.abstractcreator.product.Shape;

public class Client {

    public static void main(String[] args) {
        Shape shape1 = StaticShapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = StaticShapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = StaticShapeFactory.getShape("Square");
        shape3.draw();
    }
}
