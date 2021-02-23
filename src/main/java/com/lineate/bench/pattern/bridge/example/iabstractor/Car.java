package com.lineate.bench.pattern.bridge.example.iabstractor;

import com.lineate.bench.pattern.bridge.example.implementor.Workshop;

public class Car extends Vehicle {

    public Car(Workshop producer, Workshop assembler) {
        super(producer, assembler);
    }

    @Override
    public void manufacture() {
        System.out.println("Car");
        producer.work();
        assembler.work();
    }
}
