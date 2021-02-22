package com.lineate.bench.pattern.builder.example;

import java.util.LinkedList;
import java.util.List;

public class Vehicle {
    private List<String> parts = new LinkedList<>();

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\nProduct completed as below");
        parts.forEach(System.out::println);
    }
}
