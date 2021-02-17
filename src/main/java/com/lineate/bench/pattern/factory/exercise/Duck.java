package com.lineate.bench.pattern.factory.exercise;

public class Duck implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Inside Duck::makeSound() method.");
    }
}
