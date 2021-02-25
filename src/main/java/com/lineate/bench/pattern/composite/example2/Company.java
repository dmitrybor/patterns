package com.lineate.bench.pattern.composite.example2;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Dmitry Borisenko", 100, "Pro Developer");
        Employee dev2 = new Developer("John Smith", 101, "Entry level Developer");

        Manager engManager = new Manager("Bob Jefferson", 25000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer("Eric Carpin", 103, "Developer");

        Manager generalManager = new Manager("Roger Drake", 50000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);

        generalManager.showEmployeeDetails();
    }
}
