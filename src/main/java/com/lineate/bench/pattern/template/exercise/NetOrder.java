package com.lineate.bench.pattern.template.exercise;

public class NetOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address");
    }

    @Override
    public void doPayment() {
        System.out.println("Online Payment through netbanking, card or Paypal");
    }

    @Override
    public void delivery() {
        System.out.println("Ship the item through post office to delivery address");
    }
}
