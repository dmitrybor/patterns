package com.lineate.bench.pattern.template.exercise;

public class StoreOrder extends OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Customer chooses the item from shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Customer pays at counter through cash/POS");
    }

    @Override
    public void delivery() {
        System.out.println("Item delivered to in delivery counter");
    }
}
