package com.lineate.bench.pattern.factory.staticcreator;

import com.lineate.bench.pattern.factory.abstractcreator.product.Circle;
import com.lineate.bench.pattern.factory.abstractcreator.product.Rectangle;
import com.lineate.bench.pattern.factory.abstractcreator.product.Shape;
import com.lineate.bench.pattern.factory.abstractcreator.product.Square;

public class StaticShapeFactory {

    public static Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
