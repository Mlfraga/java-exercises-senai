package com.company;

public class Student {
    String name;
    String course;
    Float grade;

    public Student(String name, String course, Float grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    void printStudent(String name, String course, Float grade){
        System.out.println("Aluno " + name + " do curso " + course + " e teve a nota " + grade);
    }

    void printStatus(Float grade){
        if(grade >= 7 ){
            System.out.println("Aprovado.");
        }else{
            System.out.println("Reprovado.");
        }
    }

}
