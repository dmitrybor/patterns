package com.lineate.bench.pattern.builder;

public class Director {
    private VehicleBuilder builder;

    public void construct(VehicleBuilder builder) {
        this.builder = builder;
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
    }
}
