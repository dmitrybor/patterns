package com.lineate.bench.pattern.flyweight.example;

public class GenericRobot implements Robot {
    private String type;
    private String color;


    public GenericRobot(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println(String.join(" ", "This is a", type, "robot with", color, "color"));
    }

    @Override
    public void setColor(String robotColor) {
        this.color = robotColor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
