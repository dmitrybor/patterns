package com.lineate.bench.pattern.factory.exercise;

public class AnimalFactory {

    public static Animal getAnimal(String animalType) {
        if ("tiger".equalsIgnoreCase(animalType)) {
            return new Tiger();
        } else if("duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        return null;
    }
}
