package com.lineate.bench.pattern.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {
    private List<Faculty> faculties;

    private String name;
    private String position;

    public Supervisor(String name, String position) {
        this.name = name;
        this.position = position;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public List<Faculty> getMyFaculty() {
        return faculties;
    }

    @Override
    public void showDetails(String offsetFiller) {
        System.out.println(offsetFiller + String.join(" ",
                name, "is the", position));
        faculties.forEach(f -> f.showDetails(offsetFiller + "\t"));
    }
}
