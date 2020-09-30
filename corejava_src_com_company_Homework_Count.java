package com.company.Homework;

import java.sql.SQLOutput;

public class Count {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "  ");
                count = count + 1;
            }


        }
        System.out.println();
        System.out.println("There are " + count + " odds numbers. ");
    }}
