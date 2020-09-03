package com.company;

public class Customer {
    int code;
    String name;

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printCustomer(int code, String name) {
        System.out.println("O nome do cliente é: " + name + " e o código é: " + code);
    }
}
