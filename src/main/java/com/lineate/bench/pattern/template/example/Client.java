package com.lineate.bench.pattern.template.example;

public class Client {
    public static void main(String[] args) {
        HouseTemplate woodenHouse = new WoodenHouse();
        HouseTemplate glassHouse = new GlassHouse();
        woodenHouse.buildHouse();
        System.out.println("************");
        glassHouse.buildHouse();
    }
}
