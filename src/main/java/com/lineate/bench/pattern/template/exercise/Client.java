package com.lineate.bench.pattern.template.exercise;

public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        OrderProcessTemplate storeOrder = new StoreOrder();
        netOrder.processOrder(true);
        System.out.println("*********");
        storeOrder.processOrder(true);
    }
}
