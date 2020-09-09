package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] f;
        int i, j = 0;

        f = new char[5][3];

        float tamLine = f.length / 2;
        float tamColumnn = f[0].length / 2;

        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 2; j++) {
                f[i][j] = ' ';
                if (i == tamLine || j == tamColumnn) {
                    f[i][j] = 'X';
                }
            }
        }

        for (int m = 0; m <= 4; m++) {
            for (int n = 0; n <= 2; n++) {
                System.out.print(f[m][n]);
            }
            System.out.print('\n');
        }
    }
}