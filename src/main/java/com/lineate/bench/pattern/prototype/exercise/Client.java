package com.lineate.bench.pattern.prototype.exercise;

public class Client {
    public static void main(String[] args) {
        BasicCar ford = BasicCarCache.getCar("Ford");
        ford.setPrice(ford.getPrice() + 10000);
        System.out.println("Model: " + ford.getModelName() + ", price: " + ford.getPrice());

        BasicCar newFordClone = BasicCarCache.getCar("Ford");
        System.out.println("Model: " + newFordClone.getModelName() + ", price: " + newFordClone.getPrice());

        BasicCar nano = BasicCarCache.getCar("Nano");
        System.out.println("Model: " + nano.getModelName() + ", price: " + nano.getPrice());
    }
}
