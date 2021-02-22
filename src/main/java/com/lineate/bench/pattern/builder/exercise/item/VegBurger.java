package com.lineate.bench.pattern.builder.exercise.item;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Vegie Burger";
    }

    @Override
    public float getPrice() {
        return 2.99F;
    }
}
