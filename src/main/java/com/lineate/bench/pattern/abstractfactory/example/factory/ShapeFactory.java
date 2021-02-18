package com.lineate.bench.pattern.abstractfactory.example.factory;


import com.lineate.bench.pattern.abstractfactory.example.product.color.Color;
import com.lineate.bench.pattern.abstractfactory.example.product.shape.Circle;
import com.lineate.bench.pattern.abstractfactory.example.product.shape.Rectangle;
import com.lineate.bench.pattern.abstractfactory.example.product.shape.Shape;
import com.lineate.bench.pattern.abstractfactory.example.product.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if ("Circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("Square".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }
}
