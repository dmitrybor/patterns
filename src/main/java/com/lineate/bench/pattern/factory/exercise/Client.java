package com.lineate.bench.pattern.factory.exercise;

public class Client {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("tiger");
        animal1.makeSound();

        Animal animal2 = AnimalFactory.getAnimal("duck");
        animal2.makeSound();

        System.out.println(AnimalFactory.getAnimal(null));
        System.out.println(AnimalFactory.getAnimal("unknown animal"));
    }
}
