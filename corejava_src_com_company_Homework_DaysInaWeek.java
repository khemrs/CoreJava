package com.company.Homework;
import java.util.Scanner;
public class DaysInaWeek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number between 1-7:");
        int n= s.nextInt();

        switch (n) {
            case 1 -> System.out.println("Today is Sunday.");
            case 2 -> System.out.println("Today is Monday.");
            case 3 -> System.out.println("Today is Tuesday.");
            case 4 -> System.out.println("Today is Wednesday.");
            case 5 -> System.out.println("Today is Thursday.");
            case 6 -> System.out.println("Today is Friday.");
            case 7 -> System.out.println("Today is Saturday.");
        }
}}
