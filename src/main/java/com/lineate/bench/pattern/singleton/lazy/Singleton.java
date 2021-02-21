package com.lineate.bench.pattern.singleton.lazy;

public class Singleton {
    private static Singleton uniqueInstance = null;

    private int data = 0;

    /**
     * Private constructor to deny instantiation using
     * the new keyword outside of the class
     */
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
