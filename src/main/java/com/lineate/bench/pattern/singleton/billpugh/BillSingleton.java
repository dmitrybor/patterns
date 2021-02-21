package com.lineate.bench.pattern.singleton.billpugh;

public class BillSingleton {

    private int data = 0;

    /**
     * Private constructor to deny instantiation using
     * the new keyword outside of the class
     */
    private BillSingleton() {}

    public static BillSingleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public synchronized int getData() {
        return data;
    }

    public synchronized void setData(int data) {
        this.data = data;
    }

    /**
     * This inner class loaded only when referenced for the first time.
     */
    private static class SingletonHelper {
        private static final BillSingleton uniqueInstance = new BillSingleton();
    }
}
