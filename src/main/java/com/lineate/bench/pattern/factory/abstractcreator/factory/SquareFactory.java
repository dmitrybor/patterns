package com.lineate.bench.pattern.factory.abstractcreator.factory;

import com.lineate.bench.pattern.factory.abstractcreator.product.Shape;
import com.lineate.bench.pattern.factory.abstractcreator.product.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
