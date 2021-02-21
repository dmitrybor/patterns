package com.lineate.bench.pattern.builder;

public class MotorcycleBuilder implements VehicleBuilder {
    private Vehicle motorcycle = new Vehicle();

    @Override
    public void buildBody() {
        motorcycle.addPart("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        motorcycle.addPart("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        motorcycle.addPart("1 headlight is added");
    }

    @Override
    public Vehicle getVehicle() {
        return motorcycle;
    }
}
