package com.lineate.bench.pattern.mediator.exercise;

public class Buyer {
    private Auction auction;
    private String name;
    private float price;

    public Buyer(String name, Auction auction) {
        this.auction = auction;
        this.name = name;
    }

    public void bid(float price) {
        this.price = price;
    }

    public void cancel() {
        price = -1;
    }

    public void notifyEndOfAuction() {
        System.out.println(name + " has been notified that the auction is over");
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
