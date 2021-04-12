package com.lineate.bench.pattern.visitor.example;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<ItemElement> items = List.of(
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        );
        int total = calculatePrice(items);
        System.out.println("Total coat = " + total);
    }

    private static int calculatePrice(List<ItemElement> items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        return items.stream().map(i -> i.accept(visitor)).reduce(0, (a, b) -> a + b);
    }
}
