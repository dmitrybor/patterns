package com.lineate.bench.pattern.prototype.exercise;

public class Nano extends BasicCar {

    public Nano() {
        super.modelName = "Nano";
        super.setPrice(17999.0F);
    }

    public Nano clone() {
        return (Nano) super.clone();
    }
}
