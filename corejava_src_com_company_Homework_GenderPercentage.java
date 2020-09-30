package com.company.Homework;
import java.util.Scanner;


public class GenderPercentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of students:");
        double student = s.nextDouble();
        System.out.println("Please enter the number of male Students:");
        double male = s.nextDouble();
        double malepercent =(male/student)*100;
System.out.println("We have "+malepercent+"% male and "+ (100-malepercent)+ " % in the class");




}}