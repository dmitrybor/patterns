package com.lineate.bench.pattern.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private List<Employee> employeeList;

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeList = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public Employee getChild(int i){
        return employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
