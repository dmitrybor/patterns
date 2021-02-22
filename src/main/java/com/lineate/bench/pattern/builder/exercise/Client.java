package com.lineate.bench.pattern.builder.exercise;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder vegMealBuilder = new VegMealBuilder();
        director.construct(vegMealBuilder);
        vegMealBuilder.getMeal().getPrice();

        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();
        director.construct(nonVegMealBuilder);
        nonVegMealBuilder.getMeal().getPrice();
    }
}
