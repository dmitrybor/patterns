package com.lineate.bench.pattern.visitor.exercise;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Element> items = List.of(
                new BookElement(35, 5),
                new CdElement(3, 2),
                new DvdElement(4, 2)
        );
        UsPostageVisitor usPostageVisitor = new UsPostageVisitor();
        SouthAmericaPostageVisitor southAmericaPostageVisitor = new SouthAmericaPostageVisitor();
        items.forEach(i -> i.accept(usPostageVisitor));
        items.forEach(i -> i.accept(southAmericaPostageVisitor));
        System.out.println("The total postage for shipping my items to the us is: " + usPostageVisitor.getTotal());
        System.out.println("The total postage for shipping my items to the us is: " + southAmericaPostageVisitor.getTotal());
    }
}
