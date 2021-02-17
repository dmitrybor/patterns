package com.lineate.bench.pattern.abstractfactory.factory;

import com.lineate.bench.pattern.abstractfactory.product.color.Blue;
import com.lineate.bench.pattern.abstractfactory.product.color.Color;
import com.lineate.bench.pattern.abstractfactory.product.color.Green;
import com.lineate.bench.pattern.abstractfactory.product.color.Red;
import com.lineate.bench.pattern.abstractfactory.product.shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if("Red".equalsIgnoreCase(color)) {
            return new Red();
        } else if("Green".equalsIgnoreCase(color)) {
            return new Green();
        } else if("Blue".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
