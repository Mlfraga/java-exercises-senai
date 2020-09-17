package com.company;

public class Employee extends Person {
    protected int departureCode;
    protected double grossSalary;
    protected double tax;

    public Employee(int id, String name, String maritalStatus, String sex) {
        super(id, name, maritalStatus, sex);
    }

    public void setDepartureCode(int departureCode) {
        this.departureCode = departureCode;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;

        double tax = grossSalary / 100;
        this.tax = tax;
    }

    public int getDepartureCode() {
        return departureCode;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void calculateSalary() {
        double salary = grossSalary - tax;
        System.out.println("Salário: " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "departureCode=" + departureCode +
                ", grossSalary=" + grossSalary +
                ", tax=" + tax +
                ", name='" + name + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                "} " + super.toString();
    }
}
