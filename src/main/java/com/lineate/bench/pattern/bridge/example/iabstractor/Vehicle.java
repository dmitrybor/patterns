package com.lineate.bench.pattern.bridge.example.iabstractor;

import com.lineate.bench.pattern.bridge.example.implementor.Workshop;

public abstract class Vehicle {
    protected Workshop producer;
    protected Workshop assembler;

    protected Vehicle(Workshop producer, Workshop assembler) {
        this.producer = producer;
        this.assembler = assembler;
    }

    public abstract void manufacture();
}
