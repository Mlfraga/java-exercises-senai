package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número em que o contador deve parar.");
        int finalNumber = scanner.nextInt();
        int initialNumber = 0;

        for (int i = initialNumber; i <= finalNumber; i++) {
            System.out.println(i);
        }
    }
}
