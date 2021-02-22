package com.lineate.bench.pattern.prototype.exercise;

public class Ford extends BasicCar {
    public Ford() {
        super.modelName = "Ford";
        super.setPrice(21500.00F);
    }

    public Ford clone() {
        return (Ford) super.clone();
    }
}
