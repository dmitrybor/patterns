package com.lineate.bench.pattern.composite.example1;

public class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(String.join(" ", Long.toString(empId), name, position));
    }
}
