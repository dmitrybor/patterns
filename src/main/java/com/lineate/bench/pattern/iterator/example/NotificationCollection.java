package com.lineate.bench.pattern.iterator.example;

public class NotificationCollection implements Collection {
    private final static int maxItems = 6;
    private int numberOfItems = 0;
    private Notification[] notificationList = new Notification[maxItems];

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }

    public void addItem(String str) {
        if(numberOfItems < maxItems) {
            notificationList[numberOfItems] = new Notification(str);
            numberOfItems++;
        } else {
            System.err.println("Full");
        }
    }
}
