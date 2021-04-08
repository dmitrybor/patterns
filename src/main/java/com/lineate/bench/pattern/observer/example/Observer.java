package com.lineate.bench.pattern.observer.example;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
