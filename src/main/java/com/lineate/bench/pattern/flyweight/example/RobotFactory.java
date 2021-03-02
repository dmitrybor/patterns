package com.lineate.bench.pattern.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, Robot> robots = new HashMap<>();

    public int totalObjectsCreated() {
        return robots.size();
    }

    public Robot getRobot(String robotType) throws IllegalArgumentException {
        if (!robots.containsKey(robotType)) {
            switch (robotType) {
                case "king":
                    System.out.println("We do not have a King robot. So we are creating a King robot.");
                    robots.put("king", new GenericRobot("king"));
                    break;
                case "queen":
                    System.out.println("We do not have a Queen robot. So we are creating a Queen robot.");
                    robots.put("queen", new GenericRobot("queen"));
                    break;
                default:
                    throw new IllegalArgumentException("Robot Factory can create only king and queen robots");
            }
        }
        return robots.get(robotType);
    }
}
