package com.lineate.bench.pattern.strategy.example;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("dmitry@email.com", "password"));
        shoppingCart.pay(new CreditCardStrategy("Dmitry", "123456", "891", "03/25"));
    }
}
