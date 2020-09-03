package com.company;

import java.time.Year;

public class Date {
    Integer day;
    Integer month;
    Integer year;

    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void printDate(Integer day, Integer month, Integer year) {
        System.out.println("O dia é " + day + "/" + month + "/" + year);
    }

}
