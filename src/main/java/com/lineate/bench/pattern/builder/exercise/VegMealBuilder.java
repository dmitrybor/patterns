package com.lineate.bench.pattern.builder.exercise;

import com.lineate.bench.pattern.builder.exercise.item.Item;
import com.lineate.bench.pattern.builder.exercise.item.PepsiDrink;
import com.lineate.bench.pattern.builder.exercise.item.VegBurger;
import com.lineate.bench.pattern.builder.exercise.packing.Bottle;
import com.lineate.bench.pattern.builder.exercise.packing.Packing;
import com.lineate.bench.pattern.builder.exercise.packing.Wrapper;

public class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        Item burger = new VegBurger();
        Packing wrapper = new Wrapper();
        burger.setPacking(wrapper);
        meal.addItem(burger);
    }

    @Override
    public void buildDrink() {
        Item pepsi = new PepsiDrink();
        Packing bottle = new Bottle();
        pepsi.setPacking(bottle);
        meal.addItem(pepsi);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
