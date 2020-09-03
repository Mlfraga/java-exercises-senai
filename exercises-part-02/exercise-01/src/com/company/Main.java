package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia");
        Integer dia = scanner.nextInt();

        System.out.println("Digite o mês");
        Integer mes = scanner.nextInt();

        System.out.println("Digite o ano");
        Integer ano = scanner.nextInt();

        Date date = new Date(dia, mes, ano);

        date.printDate(dia, mes, ano);
    }
}
