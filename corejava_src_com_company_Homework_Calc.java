package com.company.Homework;

import java.util.Scanner;
public class Calc {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the width :");

        Double width = s.nextDouble();

        System.out.print("Enter the height:");

        Double height = s.nextDouble();

        Double areaRectangle = width * height;


        Double perimeter = 2*(width+ height);

        System.out.println("Area  = "
                + areaRectangle);
        System.out.println("Perimeter = "
                + perimeter);
    }}

