package com.lineate.bench.pattern.factory.abstractcreator.factory;

import com.lineate.bench.pattern.factory.abstractcreator.product.Shape;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}
