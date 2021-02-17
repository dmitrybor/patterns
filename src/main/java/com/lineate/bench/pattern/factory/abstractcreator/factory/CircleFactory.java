package com.lineate.bench.pattern.factory.abstractcreator.factory;

import com.lineate.bench.pattern.factory.abstractcreator.product.Circle;
import com.lineate.bench.pattern.factory.abstractcreator.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
