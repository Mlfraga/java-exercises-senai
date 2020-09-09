package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] f;
        int i, j = 0;

        f = new char[3][3];

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                f[i][j] = ' ';
                if (i - j == 0 || i + j == 2) {
                    f[i][j] = 'X';
                }
            }
        }

        for (int m = 0; m <= 2; m++) {
            for (int n = 0; n <= 2; n++) {
                System.out.print(f[m][n]);
            }
            System.out.print('\n');
        }
    }
}
