package com.lineate.bench.pattern.visitor.example;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
