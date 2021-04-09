package com.lineate.bench.pattern.strategy.example;

public class Item {
    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
