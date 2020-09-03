package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite  o nome do aluno");
        String name = scanner.nextLine();

        System.out.println("Digite o curso do aluno");
        String course = scanner.nextLine();

        System.out.println("Digite a nota do aluno");
        Float grade = scanner.nextFloat();

        if(grade > 10 ){
            System.out.println("ERROR: A nota informada deve ser menor que 10.");
            return;
        }

        Student student = new Student(name, course, grade );

        student.printStudent(name, course, grade);
        student.printStatus(grade);
    }
}
