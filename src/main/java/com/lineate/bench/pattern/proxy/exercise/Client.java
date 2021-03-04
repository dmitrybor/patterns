package com.lineate.bench.pattern.proxy.exercise;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Connection connectionProxy = new ConnectionProxy(List.of("xxx.com", "yyy.com", "zzz.com"));
        List<String> addresses = List.of("aaa.com", "xxx.com", "bbb.com");
        addresses.forEach(a -> {
            try {
                connectionProxy.connect(a);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
