package com.company;

public class Employee {
    Integer id;
    String name;
    Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateUnhealthiness(double salary) {
        double twentyPercent = salary * 0.2 ;

        return salary + twentyPercent;
    }

    double calculateComission(double salary) {
        double tenPercent = salary * 0.1;

        return salary + tenPercent;
    }
}
