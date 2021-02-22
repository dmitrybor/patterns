package com.lineate.bench.pattern.builder.exercise;

public class Director {

    public void construct(MealBuilder mealBuilder) {
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }

}
