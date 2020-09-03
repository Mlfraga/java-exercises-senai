package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do cliente.");
        int customerCode = scanner.nextInt();

        System.out.println("Digite o nome do cliente.");
        String customerName = scanner.nextLine();

        Customer customer = new Customer();

        customer.setCode(customerCode);
        customer.setName(customerName);

        customer.printCustomer(customerCode, customerName);
    }
}
