package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        ArrayList<String> departures = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        Boolean question = true;

        int falgWorkArround = 0;

        do {
            System.out.print("\r\n");
            System.out.println("Ficha cadastral de funcionários");

            System.out.println("Digite o nome: ");
            String name = input.nextLine();

            if (falgWorkArround != 0) {
                String name2 = input.nextLine();
                name = name2;
            }

            System.out.println("Digite o estado cívil: ");
            String maritalStatus = input.nextLine();

            System.out.println("Digite o sexo: ");
            String sex = input.nextLine();

            System.out.println("Digite o nome do departamento: ");
            String departureName = input.nextLine();

            boolean departureExists = departures.contains(departureName);
            int departureId;

            if (departureExists) {
                int index = departures.indexOf(departureName);
                departureId = index + 1;
            } else {
                departures.add(departureName);
                departureId = departures.size();
            }

            System.out.println("Digite o salário bruto: ");
            Double grossSalary = input.nextDouble();

            System.out.println("É um administrador? (true = Sim/ false = Não) ");
            Boolean isAdmin = input.nextBoolean();

            int id = people.size() + 1;

            Employee employee;

            if (isAdmin) {
                employee = new Administrator(id, name, maritalStatus, sex);

                System.out.print("- Ajuda de custos: ");
                double aidCosts = input.nextDouble();

                ((Administrator) employee).setAidCost(aidCosts);
            } else {
                employee = new Employee(id, name, maritalStatus, sex);
            }

            employee.setGrossSalary(grossSalary);
            employee.setDepartureCode(departureId);

            System.out.println(employee);
            employee.calculateSalary();

            people.add(employee);

            System.out.println("Deseja cadastrar outro funcionário? (true = Sim/ false = Não) ");
            question = input.nextBoolean();
            falgWorkArround = 1;

        } while (question == true);

    }
}
