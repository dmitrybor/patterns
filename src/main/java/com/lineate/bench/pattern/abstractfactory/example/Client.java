package com.lineate.bench.pattern.abstractfactory.example;

import com.lineate.bench.pattern.abstractfactory.example.factory.AbstractFactory;
import com.lineate.bench.pattern.abstractfactory.example.factory.FactoryProducer;
import com.lineate.bench.pattern.abstractfactory.example.product.color.Color;
import com.lineate.bench.pattern.abstractfactory.example.product.shape.Shape;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape1 = shapeFactory.getShape("Circle");
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
