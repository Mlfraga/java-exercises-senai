package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em dinheiro que desja acrescentar os juros.");
        float value = scanner.nextFloat();

        System.out.println("Digite a porcentagem de juros que deseja calcular (SEM O CARACTERE DE %).");
        float interest = scanner.nextFloat();
        git push --set-upstream origin master

        float  interestAmount = value / 100 * interest ;
        float finalValue = (interestAmount + value);

        System.out.println(finalValue);

    }
}
