package com.lineate.bench.pattern.composite.exercise;

public class Professor implements Faculty {
    private String name;
    private String position;
    private int officeNumber;

    public Professor(String name, String position, int officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public void showDetails(String offsetFiller) {
        System.out.println(offsetFiller + String.join(" ",
                name, "is the", position));
    }
}
