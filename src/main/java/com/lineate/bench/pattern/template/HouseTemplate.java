package com.lineate.bench.pattern.template;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    public void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods, and sand");
    }

    public abstract void buildPillars();

    public abstract void buildWalls();

    public void buildWindows() {
        System.out.println("Building Glass Windows");
    }
}
