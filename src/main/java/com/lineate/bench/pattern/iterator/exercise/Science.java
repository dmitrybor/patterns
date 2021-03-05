package com.lineate.bench.pattern.iterator.exercise;

import java.util.LinkedList;
import java.util.List;

public class Science implements Subject {
    private List<String> subjects = new LinkedList<>();


    public void addSubject(String subject) {
        subjects.add(subject);
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
