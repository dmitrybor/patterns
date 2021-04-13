package com.lineate.bench.pattern.visitor.exercise;

public interface Element {
    float accept(Visitor visitor);
    int getWeight();
    int getPrice();
}
