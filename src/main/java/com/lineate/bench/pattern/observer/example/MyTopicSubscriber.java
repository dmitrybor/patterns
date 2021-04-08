package com.lineate.bench.pattern.observer.example;

import static java.util.Objects.isNull;

public class MyTopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name, Subject topic) {
        this.name = name;
        this.topic = topic;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate();
        if (isNull(msg)) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message ::" + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
