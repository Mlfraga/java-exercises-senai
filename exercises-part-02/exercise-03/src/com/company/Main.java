package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de lados da forma geométrica");
        Integer numberOfSides = scanner.nextInt();

        if (numberOfSides < 3 || numberOfSides > 8) {
            System.out.println("ERROR: A forma geométrica deve ter entre 3 e 8 lados");
            return;
        }

        GeometricForm geometricForm = new GeometricForm(numberOfSides);

        String form = geometricForm.formType(numberOfSides);

        System.out.println(form);

    }
}
