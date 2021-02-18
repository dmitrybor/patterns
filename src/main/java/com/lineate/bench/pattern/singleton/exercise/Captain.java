package com.lineate.bench.pattern.singleton.exercise;

public class Captain {

    private String name;

    private Captain() { }

    private Captain(String name) {
        this.name = name;
    }

    public static Captain get() {
        return Helper.uniqueInstance;
    }

    public String getName() {
        return name;
    }

    private static class Helper {
        private static final Captain uniqueInstance = new Captain("Bill");
    }
}
