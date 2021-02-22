package com.lineate.bench.pattern.builder.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");

        Director director = new Director();

        VehicleBuilder carBuilder = new CarBuilder();
        VehicleBuilder motorcycleBuilder = new MotorcycleBuilder();

        director.construct(carBuilder);
        Vehicle car = carBuilder.getVehicle();
        car.show();

        director.construct(motorcycleBuilder);
        Vehicle motorcycle = motorcycleBuilder.getVehicle();
        motorcycle.show();
    }
}
