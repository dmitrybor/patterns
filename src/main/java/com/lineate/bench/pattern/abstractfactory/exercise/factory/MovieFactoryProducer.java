package com.lineate.bench.pattern.abstractfactory.exercise.factory;

public class MovieFactoryProducer {
    public static MovieFactory getMovieFactory(String movieFactoryType) {
        if ("action".equalsIgnoreCase(movieFactoryType)) {
            return new ActionMovieFactory();
        } else if ("comedy".equalsIgnoreCase(movieFactoryType)) {
            return new ComedyMovieFactory();
        }
        return null;
    }
}
