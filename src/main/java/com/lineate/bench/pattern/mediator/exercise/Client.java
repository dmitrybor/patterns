package com.lineate.bench.pattern.mediator.exercise;

public class Client {
    public static void main(String[] args) {
        Auction auction = new VacationAuction();
        Buyer buyer1 = new Buyer("Tal Baum", auction);
        Buyer buyer2 = new Buyer("Elad Shamailov", auction);
        Buyer buyer3 = new Buyer("John smith", auction);
        auction.addBuyer(buyer1);
        auction.addBuyer(buyer2);
        auction.addBuyer(buyer3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Vegas. Please make your offers.");
        System.out.println("Waiting for the buyer's offers");
        buyer1.bid(1800);
        buyer2.bid(2000);
        buyer3.bid(1700);
        auction.findTheHighestBitter();
        buyer2.cancel();
        System.out.println(buyer2.getName() + " has canceled his bid!");
        auction.findTheHighestBitter();
    }
}
