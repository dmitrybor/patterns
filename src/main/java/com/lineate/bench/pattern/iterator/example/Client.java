package com.lineate.bench.pattern.iterator.example;

public class Client {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        nc.addItem("Notification 1");
        nc.addItem("Notification 2");
        nc.addItem("Notification 3");
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
