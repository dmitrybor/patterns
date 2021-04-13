package com.lineate.bench.pattern.visitor.exercise;

public interface Visitor {
    float visit(BookElement element);

    float visit(CdElement element);

    float visit(DvdElement element);
}
