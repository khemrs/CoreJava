package classPractice;

import java.util.Scanner;

public class PrintSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("How many  many rows ?");
        int n = sc.nextInt ();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 3 == 0)
                    System.out.print ("# ");

                if (i % 3 == 1)
                    System.out.print ("$ ");
                if (i % 3 == 2)
                    System.out.print ("& ");


            }

            System.out.println ();
        }
    }
}