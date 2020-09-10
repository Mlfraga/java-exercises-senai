package com.company;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sou um robo que inverterei a ordem dos valores de sua lista numérica.");

        System.out.println("Digite quantos números irão compor sua lista.");
        int arrayLengh = scanner.nextInt();

        int lenghtTest = 1;

        do {
            System.out.println("Digite o " + lenghtTest + "° número.");
            int loopNumber = scanner.nextInt();

            list.add(loopNumber);
            lenghtTest++;
        } while (lenghtTest <= arrayLengh);

        printReverseArray(list);
    }

    public static void printReverseArray(List<Integer> arrayParam) {
        System.out.println("A sua lista na ordem inversa ficou assim:");
        for (int i = arrayParam.size() - 1; i >= 0; i--) {
            System.out.println(arrayParam.get(i));
        }
    }
}
