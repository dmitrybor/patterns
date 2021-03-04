package com.lineate.bench.pattern.command.exercise;

public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock("Tesla", 10);
        Order buyOrder1 = new BuyStock(stock);
        Order sellOrder1 = new SellStock(stock);
        Order buyOrder2 = new BuyStock(stock);
        Order sellOrder2 = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder1);
        broker.takeOrder(buyOrder2);
        broker.takeOrder(sellOrder1);
        broker.placeOrders();
        broker.takeOrder(sellOrder2);
        broker.placeOrders();
    }
}
