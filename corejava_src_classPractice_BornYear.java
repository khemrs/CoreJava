package classPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BornYear {
    public static void main(String[] args) {
        int age;
        do {
            System.out.println ("Enter your age");
            Scanner scan = new Scanner (System.in);

            try {
                age = scan.nextInt ();
                break;
            } catch (InputMismatchException e) {
                System.out.println ("Invalid Input! Enter valid number");
            }
        } while (true);
        int bornYear = 2020 - age;
        System.out.println ("your born year is  " + bornYear);

    }
}


