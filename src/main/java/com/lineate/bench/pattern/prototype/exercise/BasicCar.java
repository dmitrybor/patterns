package com.lineate.bench.pattern.prototype.exercise;

public abstract class BasicCar implements Cloneable {
    private float price;
    protected String modelName;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
