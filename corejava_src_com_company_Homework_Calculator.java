package com.company.Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice;
        int a;
        int b;
        Calculator calculator = new Calculator ();
        System.out.println ("WELCOME TO SIMPLE MATH CALCULATOR");
        while (true) {
            System.out.println ("What do you want to do?");
            System.out.println ("1. Add");
            System.out.println ("2. Sub");
            System.out.println ("3. Mul");
            System.out.println ("4. Div");
            System.out.println ("5. Quit");
            Scanner scanner = new Scanner (System.in);
            choice = scanner.nextInt ();
            if (choice == 5)
                break;
            if (choice > 5 || choice < 1) {
                System.out.println ("Unexpected user input");
                continue;
            }
            System.out.println ("Enter first number");
            a = scanner.nextInt ();
            System.out.println ("Enter second number");
            b = scanner.nextInt ();
            switch (choice) {
                case 1:
                    System.out.println ("Sum = " + calculator.add (a, b));
                    break;
                case 2:
                    System.out.println ("Subtraction = " + calculator.sub (a, b));
                    break;
                case 3:
                    System.out.println ("Multiplication = " + calculator.mul (a, b));
                    break;
                case 4:
                    System.out.println ("Division = " + calculator.div (a, b));
                    break;
                default:
            }
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return a / b;
    }
}