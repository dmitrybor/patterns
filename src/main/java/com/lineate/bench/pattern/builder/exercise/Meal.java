package com.lineate.bench.pattern.builder.exercise;

import com.lineate.bench.pattern.builder.exercise.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void getPrice() {
        System.out.println("-------------");
        float totalPrice = items.stream()
                .peek(item -> {
                    System.out.println(
                            String.join("", "Item: ", item.getName(),
                            ", Packing: ", item.getPacking().pack(),
                            ", Price: ", Float.toString(item.getPrice()))
                    );
                })
                .map(Item::getPrice)
                .reduce(0F, (a, b) -> a + b);
        System.out.println("Total price: " + totalPrice);
    }
}
