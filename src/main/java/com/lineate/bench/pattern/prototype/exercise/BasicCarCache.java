package com.lineate.bench.pattern.prototype.exercise;

import java.util.HashMap;
import java.util.Map;

public class BasicCarCache {
    private static Map<String, BasicCar> carCache = new HashMap<>();

    static {
        BasicCar ford = new Ford();
        carCache.put(ford.getModelName(), ford);
        BasicCar nano = new Nano();
        carCache.put(nano.getModelName(), nano);
    }

    public static BasicCar getCar(String modelName) {
        BasicCar cachedCar = carCache.get(modelName);
        return (BasicCar) cachedCar.clone();
    }
}
