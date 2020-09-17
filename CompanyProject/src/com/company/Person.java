package com.company;

public abstract class Person {
    protected int id;
    protected String name;
    protected String maritalStatus;
    protected String sex;

    public Person(int id, String name, String maritalStatus, String sex) {
        this.id = id;
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
