package com.lineate.bench.pattern.iterator.example;

public class NotificationIterator implements Iterator {
    private Notification[] notificationList;
    private int position = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return (position < notificationList.length) && (null != notificationList[position]);
    }

    @Override
    public Object next() {
        Notification notification = notificationList[position];
        position++;
        return notification;
    }
}
