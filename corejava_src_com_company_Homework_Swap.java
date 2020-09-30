package com.company.Homework;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the  value of x : ");
        x = in.nextInt();
        System.out.println("Please enter the value of y: ");
        y = in.nextInt();

   doSwap(x,y);

    }

     static void doSwap(int x, int y )
    {
        int temp;
        temp =x;
        x = y;
        y = temp;
        System.out.println("values of x  after swapping  : "+x);
        System.out.println("values of y  after swapping  : "+y);
    }}
