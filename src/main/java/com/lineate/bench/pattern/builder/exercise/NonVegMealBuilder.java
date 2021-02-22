package com.lineate.bench.pattern.builder.exercise;

import com.lineate.bench.pattern.builder.exercise.item.ChickenBurger;
import com.lineate.bench.pattern.builder.exercise.item.CokeDrink;
import com.lineate.bench.pattern.builder.exercise.item.Item;
import com.lineate.bench.pattern.builder.exercise.packing.Bottle;
import com.lineate.bench.pattern.builder.exercise.packing.Packing;
import com.lineate.bench.pattern.builder.exercise.packing.Wrapper;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        Item burger = new ChickenBurger();
        Packing wrapper = new Wrapper();
        burger.setPacking(wrapper);
        meal.addItem(burger);
    }

    @Override
    public void buildDrink() {
        Item coke = new CokeDrink();
        Packing bottle = new Bottle();
        coke.setPacking(bottle);
        meal.addItem(coke);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
