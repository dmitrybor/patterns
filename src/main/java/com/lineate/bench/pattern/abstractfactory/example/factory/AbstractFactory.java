package com.lineate.bench.pattern.abstractfactory.example.factory;

import com.lineate.bench.pattern.abstractfactory.example.product.color.Color;
import com.lineate.bench.pattern.abstractfactory.example.product.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
