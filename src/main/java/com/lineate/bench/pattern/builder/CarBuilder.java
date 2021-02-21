package com.lineate.bench.pattern.builder;

public class CarBuilder implements VehicleBuilder {
    private Vehicle car = new Vehicle();

    @Override
    public void buildBody() {
        car.addPart("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        car.addPart("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        car.addPart("2 headlights are added");
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
