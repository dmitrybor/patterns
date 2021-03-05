package com.lineate.bench.pattern.iterator.exercise;

public class Arts implements Subject{
    private final int maxSize = 10;
    private final String[] subjects = new String[maxSize];
    private int position = 0;

    public void addSubject(String subject) {
        if (position < subject.length()) {
            subjects[position] = subject;
            position++;
        } else {
            System.err.println("Full");
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
