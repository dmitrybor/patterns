package com.lineate.bench.pattern.iterator.exercise;

import java.util.List;

public class ScienceIterator implements Iterator {
    private List<String> list;
    private java.util.Iterator<String> iterator;
    private int position;

    public ScienceIterator(List<String> list) {
        this.list = list;
        this.position = 0;
        this.iterator = list.iterator();
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        if (position < list.size()) {
            return list.get(position++);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return position >= list.size();
    }

    @Override
    public String currentItem() {
        if (position < list.size()) {
            return list.get(position);
        }
        return null;
    }
}
