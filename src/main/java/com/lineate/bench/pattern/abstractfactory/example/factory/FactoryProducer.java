package com.lineate.bench.pattern.abstractfactory.example.factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if ("shape".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        }
        return null;
    }
}
