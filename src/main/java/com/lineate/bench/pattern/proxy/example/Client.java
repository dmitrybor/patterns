package com.lineate.bench.pattern.proxy.example;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("someFilename.jpg");
        image.display();
        image.display();
    }
}
