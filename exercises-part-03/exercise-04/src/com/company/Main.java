package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> firstArray = new ArrayList<>();
        List<Integer> secondArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sou um robo que retornarei quantos números coincidem em 2 arrays.");

        System.out.println("Digite quantos números irão compor os dois arrays.");
        int arrayLength = scanner.nextInt();

        int lengthTest = 1;

        do {
            System.out.println("Digite o " + lengthTest + "° número do primeiro array.");
            int loopNumber = scanner.nextInt();

            firstArray.add(loopNumber);
            lengthTest++;
        } while (lengthTest <= arrayLength);

        lengthTest = 1;

        do {
            System.out.println("Digite o " + lengthTest + "° número do segundo array.");
            int loopNumber = scanner.nextInt();

            secondArray.add(loopNumber);
            lengthTest++;
        } while (lengthTest <= arrayLength);

        similarNumbersArrays(firstArray, secondArray);
    }

    public static void similarNumbersArrays(List<Integer> firstArrayParam, List<Integer> secondArrayParam) {
        int arraysLength = firstArrayParam.size();
        List<Integer> similarArray = new ArrayList<>();

        int numOfSimilar = 0;
        for (int i = 0; i <= arraysLength - 1; i++) {
            if (firstArrayParam.get(i) == secondArrayParam.get(i)) {
                numOfSimilar++;
                similarArray.add(firstArrayParam.get(i));
            }
        }
        System.out.println("Os dois arrays tem " + numOfSimilar + " números iguais. \nQue são eles: " + similarArray);
    }
}
