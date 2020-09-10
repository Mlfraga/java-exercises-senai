package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------Bot criador de matriz quadrada-----------------------------");
        System.out.println("Digite quantas linhas e colunas a matriz vai ter.");
        int i, j, y = 0;
        int numOfRowsAndColumns = scanner.nextInt();
        int[][] matrix;

        matrix = new int[numOfRowsAndColumns][numOfRowsAndColumns];

        Random random = new Random();

        for (i = 0; i <= numOfRowsAndColumns - 1; i++) {
            for (j = 0; j <= numOfRowsAndColumns - 1; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }

        for (y = 0; y <= numOfRowsAndColumns - 1; y++) {
            for (j = 0; j <= numOfRowsAndColumns - 1; j++) {
                System.out.print(" " + matrix[y][j] + " ");
            }
            System.out.println();
        }

    }
}
