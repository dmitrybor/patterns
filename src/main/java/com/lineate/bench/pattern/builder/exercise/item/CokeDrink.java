package com.lineate.bench.pattern.builder.exercise.item;

public class CokeDrink extends ColdDrink {

    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public float getPrice() {
        return 2.25F;
    }
}
