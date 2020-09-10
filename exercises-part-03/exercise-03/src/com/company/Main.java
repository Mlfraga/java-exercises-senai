package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------- Cadastrar usuário ---------------------------------");

        System.out.println("Digite o ID do funcionário.");
        Integer id = scanner.nextInt();

        System.out.println("Digite o nome do funcionário.");
        String name = scanner.next();

        System.out.println("Digite o salário do funcionário.");
        Double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, salary);

        Double unhealthiness = employee.calculateUnhealthiness(salary);
        Double commission = employee.calculateComission(salary);

        System.out.println("Usuário criado: \n ID: " + employee.id + "\n Name: " + employee.name + "\n Salário: " + employee.salary + "\n Insalubridade: " + unhealthiness + "\n Comissão: " + commission);


    }
}
