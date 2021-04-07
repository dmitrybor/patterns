package com.lineate.bench.pattern.memento.exercise;

import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        IntStream.rangeClosed(1, 6).forEach(i -> {
            originator.setState("State #" + i);
            careTaker.save(originator);
        });

        System.out.println("Current state: " + originator);
        careTaker.restore(originator, 0);
        System.out.println("The first saved state: " + originator);
        careTaker.restore(originator, 2);
        System.out.println("The third saved state: " + originator);
    }
}
