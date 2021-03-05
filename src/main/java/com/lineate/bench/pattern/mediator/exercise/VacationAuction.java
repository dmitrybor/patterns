package com.lineate.bench.pattern.mediator.exercise;

import java.util.ArrayList;
import java.util.List;

public class VacationAuction implements Auction {
    private List<Buyer> buyers;

    public VacationAuction() {
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName() + " was added to the buyers list.");
    }

    @Override
    public void findTheHighestBitter() {
        buyers.stream()
                .sorted((a, b) -> (int) ((b.getPrice() - a.getPrice()) * 10))
                .findFirst()
                .ifPresent(winner -> {
                    System.out.println("The auction winner is " + winner.getName());
                    System.out.println("He paid " + winner.getPrice() + "$ for the item");
                });
        buyers.forEach(Buyer::notifyEndOfAuction);
    }
}
