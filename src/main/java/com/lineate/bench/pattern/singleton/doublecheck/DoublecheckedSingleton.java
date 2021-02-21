package com.lineate.bench.pattern.singleton.doublecheck;

import com.lineate.bench.pattern.singleton.lazy.Singleton;

public class DoublecheckedSingleton {
    private volatile static DoublecheckedSingleton uniqueInstance = null;

    private int data = 0;

    /**
     * Private constructor to deny instantiation using
     * the new keyword outside of the class
     */
    private DoublecheckedSingleton() {}

    public static DoublecheckedSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoublecheckedSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public synchronized void setData(int data) {
        this.data = data;
    }
}
