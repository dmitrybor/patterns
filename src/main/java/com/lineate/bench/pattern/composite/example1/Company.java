package com.lineate.bench.pattern.composite.example1;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Dmitry Borisenko", 100, "Pro Developer");
        Employee dev2 = new Developer("John Smith", 101, "Entry level Developer");
        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Bob Jefferson", 200, "SEO Manager");
        Employee man2 = new Manager("Ron Sparkley", 201, "Line manager");
        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
