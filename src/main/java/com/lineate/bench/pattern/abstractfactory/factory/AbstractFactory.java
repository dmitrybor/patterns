package com.lineate.bench.pattern.abstractfactory.factory;

import com.lineate.bench.pattern.abstractfactory.product.color.Color;
import com.lineate.bench.pattern.abstractfactory.product.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
