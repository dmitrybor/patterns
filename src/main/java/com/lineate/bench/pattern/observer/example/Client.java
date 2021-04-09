package com.lineate.bench.pattern.observer.example;

public class Client {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        MyTopicSubscriber subscriber1 = new MyTopicSubscriber("subscriber1", topic);
        MyTopicSubscriber subscriber2 = new MyTopicSubscriber("subscriber2", topic);
        MyTopicSubscriber subscriber3 = new MyTopicSubscriber("subscriber3", topic);

        topic.register(subscriber1);
        topic.register(subscriber2);
        topic.register(subscriber3);

        topic.postMessage("Message1");
        topic.postMessage("Message2");
    }
}
