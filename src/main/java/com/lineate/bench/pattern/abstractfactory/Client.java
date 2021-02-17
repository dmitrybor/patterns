package com.lineate.bench.pattern.abstractfactory;

import com.lineate.bench.pattern.abstractfactory.factory.AbstractFactory;
import com.lineate.bench.pattern.abstractfactory.factory.FactoryProducer;
import com.lineate.bench.pattern.abstractfactory.product.color.Color;
import com.lineate.bench.pattern.abstractfactory.product.shape.Shape;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape1  = shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("Red");
        color1.fill();
        Color color2 = colorFactory.getColor("Green");
        color2.fill();
        Color color3 = colorFactory.getColor("Blue");
        color3.fill();
    }
}
