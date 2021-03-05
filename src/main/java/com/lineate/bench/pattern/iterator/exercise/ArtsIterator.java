package com.lineate.bench.pattern.iterator.exercise;

public class ArtsIterator implements Iterator {
    private final String[] list;
    private int position = 0;

    public ArtsIterator(String[] list) {
        this.list = list;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        if (position < list.length) {
            return list[position++];
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return (position >= list.length) || (null == list[position]);
    }

    @Override
    public String currentItem() {
        if (position < list.length) {
            return list[position];
        }
        return null;
    }
}
