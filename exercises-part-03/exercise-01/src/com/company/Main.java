package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int response;

        System.out.println("---------CALCULE O MAIOR VALOR ENTRE 2 OU 3 NÚMEROS---------.");

        System.out.println("Digite o primeiro número.");
        int firstNumber = scanner.nextInt();

        System.out.println("Digite o segundo número.");
        int secondNumber = scanner.nextInt();

        System.out.println("Deseja calcular o terceiro número? (digite s para SIM ou qualquer outro caractere NÃO)");
        String question = scanner.next();

        if (question.equals("s")) {
            System.out.println("Digite o terceiro número.");
            int thirdNumber = scanner.nextInt();

            response = calculateThreeNumbers(firstNumber, secondNumber, thirdNumber);
            System.out.println("O maior valor entre os três é: " + response);
            return;
        }

        response = calculateTwoNumbers(firstNumber, secondNumber);
        System.out.println("O maior valor entre os dois é: " + response);
    }

    public static int calculateTwoNumbers(int firstNumberParam, int secondNumberParam) {
        if (firstNumberParam > secondNumberParam) {
            return firstNumberParam;
        }
        return secondNumberParam;
    }

    public static int calculateThreeNumbers(int firstNumberParam, int secondNumberParam, int thirdNumberParam) {
        if (firstNumberParam > secondNumberParam && firstNumberParam > thirdNumberParam) {
            return firstNumberParam;
        }

        if (secondNumberParam > firstNumberParam && secondNumberParam > thirdNumberParam) {
            return secondNumberParam;
        }

        return thirdNumberParam;
    }
}
