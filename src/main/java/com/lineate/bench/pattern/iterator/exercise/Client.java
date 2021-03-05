package com.lineate.bench.pattern.iterator.exercise;

public class Client {
    public static void main(String[] args) {
        Arts arts = new Arts();
        arts.addSubject("Bengali");
        arts.addSubject("English");

        Science science = new Science();
        science.addSubject("Maths");
        science.addSubject("Comp. Sc.");
        science.addSubject("Physics");

        System.out.println("\nScience subjects :");
        showSubjects(science);
        System.out.println("\nArts subjects :");
        showSubjects(arts);
    }

    private static void showSubjects(Subject subject) {
        Iterator iterator = subject.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
