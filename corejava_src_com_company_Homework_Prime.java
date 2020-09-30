package com.company.Homework;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        boolean check = false; int i =2;
        Scanner s = new Scanner(System.in);

        System.out.print("Entera number to be checked :");
        int x = s.nextInt();
        while(i <= x/2)
        {
            // condition for nonprime number
            if (x % i == 0)
            {
                check = true;
                break;
            }

            ++i;
        }

        if (!check)
            System.out.println("The entered number "+x + " is a prime number.");
        else
            System.out.println("The entered number "+x + " is not a prime number.");
    }
}

