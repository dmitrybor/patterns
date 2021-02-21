package com.lineate.bench.pattern.builder;

public interface VehicleBuilder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Vehicle getVehicle();
}
