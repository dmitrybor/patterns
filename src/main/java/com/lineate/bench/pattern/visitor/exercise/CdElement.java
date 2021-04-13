package com.lineate.bench.pattern.visitor.exercise;

public class CdElement implements Element{
    private int price;
    private int weight;

    public CdElement(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public float accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
