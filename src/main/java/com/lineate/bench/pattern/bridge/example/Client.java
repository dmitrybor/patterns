package com.lineate.bench.pattern.bridge.example;

import com.lineate.bench.pattern.bridge.example.iabstractor.Bike;
import com.lineate.bench.pattern.bridge.example.iabstractor.Car;
import com.lineate.bench.pattern.bridge.example.iabstractor.Vehicle;
import com.lineate.bench.pattern.bridge.example.implementor.Assembler;
import com.lineate.bench.pattern.bridge.example.implementor.Producer;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new Car(new Producer(), new Assembler());
        car.manufacture();
        Vehicle bike = new Bike(new Producer(), new Assembler());
        bike.manufacture();
    }
}
