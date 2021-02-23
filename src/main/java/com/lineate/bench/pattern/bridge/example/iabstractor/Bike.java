package com.lineate.bench.pattern.bridge.example.iabstractor;

import com.lineate.bench.pattern.bridge.example.implementor.Workshop;

public class Bike extends Vehicle {

    public Bike(Workshop producer, Workshop assembler) {
        super(producer, assembler);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike");
        producer.work();
        assembler.work();
    }
}
