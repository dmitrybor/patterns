package com.lineate.bench.pattern.factory.abstractcreator.factory;

import com.lineate.bench.pattern.factory.abstractcreator.product.Rectangle;
import com.lineate.bench.pattern.factory.abstractcreator.product.Shape;

public class RectangleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
