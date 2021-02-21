package com.lineate.bench.pattern.singleton.lazy;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        s1.setData(55);
        System.out.println("First reference: " + s1);
        System.out.println("Data: " + s1.getData());

        Singleton s2 = Singleton.getInstance();
        System.out.println("Second reference: " + s2);
        System.out.println("Data: " + s1.getData());
    }
}
