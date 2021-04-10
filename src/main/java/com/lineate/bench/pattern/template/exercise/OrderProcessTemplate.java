package com.lineate.bench.pattern.template.exercise;

public abstract class OrderProcessTemplate {

    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) {
            giftWrapping();
        }
        delivery();
    }

    public abstract void doSelect();
    public abstract void doPayment();
    public abstract void delivery();

    public void giftWrapping() {
        System.out.println("Gift wrap successful");
    }
}
