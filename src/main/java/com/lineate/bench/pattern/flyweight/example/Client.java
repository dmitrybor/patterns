package com.lineate.bench.pattern.flyweight.example;

import java.util.Random;
import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();
        IntStream.rangeClosed(1, 5).forEach(i -> {
            Robot kingRobot = robotFactory.getRobot("king");
            kingRobot.setColor(getRandomColor());
            kingRobot.print();
        });

        IntStream.rangeClosed(1, 5).forEach(i -> {
            Robot queenRobot = robotFactory.getRobot("queen");
            queenRobot.setColor(getRandomColor());
            queenRobot.print();
        });

        System.out.println("Total objects created: " + Integer.toString(robotFactory.totalObjectsCreated()));
    }

    private static String getRandomColor() {
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
