package com.company;

public class Administrator extends Employee {
    protected double aidCost;

    public Administrator(int id, String name, String maritalStatus, String sex) {
        super(id, name, maritalStatus, sex);
    }

    public void setAidCost(double aidCost) {
        this.aidCost = aidCost;

        setGrossSalary(this.getGrossSalary() + aidCost);
    }

    @Override
    public void calculateSalary() {
        double salary = (grossSalary - tax) + aidCost;
        System.out.println("Salário: " + salary);
        ;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "aidCost=" + aidCost +
                ", departureCode=" + departureCode +
                ", grossSalary=" + grossSalary +
                ", tax=" + tax +
                ", name='" + name + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                "} " + super.toString();
    }
}
