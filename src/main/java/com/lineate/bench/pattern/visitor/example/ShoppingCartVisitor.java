package com.lineate.bench.pattern.visitor.example;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
