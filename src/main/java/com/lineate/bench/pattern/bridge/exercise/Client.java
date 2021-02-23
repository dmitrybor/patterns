package com.lineate.bench.pattern.bridge.exercise;

public class Client {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color green = new GreenColor();
        Shape redTriangle = new Triangle(red);
        Shape greenRectangle = new Rectangle(green);

        System.out.println("*** Bridge pattern demo ***");
        System.out.println("Drawing a red triangle");
        redTriangle.draw();
        System.out.println("Changing the width of the border 3 times");
        redTriangle.modifyBorder(redTriangle.getBorderWidth() * 3);
        redTriangle.draw();
        System.out.println("Drawing a green rectangle");
        greenRectangle.draw();
    }
}
