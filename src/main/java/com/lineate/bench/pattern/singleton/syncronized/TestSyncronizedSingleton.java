package com.lineate.bench.pattern.singleton.syncronized;

public class TestSyncronizedSingleton {

    public static void main(String[] args) {
        SyncronizedSingleton s1 = SyncronizedSingleton.getInstance();

        s1.setData(55);
        System.out.println("First reference: " + s1);
        System.out.println("Data: " + s1.getData());

        SyncronizedSingleton s2 = SyncronizedSingleton.getInstance();
        System.out.println("Second reference: " + s2);
        System.out.println("Data: " + s1.getData());
    }
}
