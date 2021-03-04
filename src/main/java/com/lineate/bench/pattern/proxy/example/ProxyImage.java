package com.lineate.bench.pattern.proxy.example;

public class ProxyImage implements Image {
    private Image realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
