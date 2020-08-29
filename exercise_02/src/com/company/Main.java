package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo atual");
        float minimumSalary = scanner.nextFloat();

        System.out.println("Digite o valor do seu salário atual");
        float personSalary = scanner.nextFloat();

        float amountOfMinimumWages = personSalary / minimumSalary;

        System.out.println("Você atualmente recebe " + amountOfMinimumWages + " salário(s) mínimo(s)");

    }
}
