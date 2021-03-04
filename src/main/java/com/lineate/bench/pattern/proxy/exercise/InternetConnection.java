package com.lineate.bench.pattern.proxy.exercise;

public class InternetConnection implements Connection {

    @Override
    public void connect(String address) {
        System.out.println("Connecting to " + address);
    }
}
