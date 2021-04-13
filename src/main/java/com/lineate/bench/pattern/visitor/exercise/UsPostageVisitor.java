package com.lineate.bench.pattern.visitor.exercise;

public class UsPostageVisitor implements Visitor {
    private float total = 0;

    @Override
    public float visit(BookElement element) {
        return visit(element, 2);
    }

    @Override
    public float visit(CdElement element) {
        return visit(element, 2.5F);
    }

    @Override
    public float visit(DvdElement element) {
        return visit(element, 3);
    }

    public float getTotal() {
        return total;
    }

    private float visit(Element element, float costPerUnitWeight) {
        if (element.getPrice() > 20) {
            return 0;
        }
        float cost = element.getWeight() * costPerUnitWeight;
        total += cost;
        return cost;
    }
}
