package com.lineate.bench.pattern.singleton.syncronized;

public class SyncronizedSingleton {
    private static SyncronizedSingleton uniqueInstance = null;

    private int data = 0;

    /**
     * Private constructor to deny instantiation using
     * the new keyword outside of the class
     */
    private SyncronizedSingleton() {}

    public static synchronized SyncronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SyncronizedSingleton();
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
