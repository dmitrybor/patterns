package com.lineate.bench.pattern.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {
    private List<Employee> employeeList;

    public Directory() {
        employeeList = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails() {
        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
