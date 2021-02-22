package com.lineate.bench.pattern.builder.example;

public interface VehicleBuilder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Vehicle getVehicle();
}
