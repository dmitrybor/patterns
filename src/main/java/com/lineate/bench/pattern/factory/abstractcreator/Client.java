package com.lineate.bench.pattern.factory.abstractcreator;

import com.lineate.bench.pattern.factory.abstractcreator.factory.CircleFactory;
import com.lineate.bench.pattern.factory.abstractcreator.factory.RectangleFactory;
import com.lineate.bench.pattern.factory.abstractcreator.factory.SquareFactory;
import com.lineate.bench.pattern.factory.abstractcreator.product.Shape;

public class Client {
    public static void main(String[] args) {
        System.out.println("Abstract Creator Demonstration");

        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();
    }
}
