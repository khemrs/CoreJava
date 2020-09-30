package classPractice;


import java.util.Scanner;

public class CheckDuplicate {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println ("enter number of elements");

        int n = s.nextInt ();

        int[] array = new int[n];
        System.out.println ("enter number of elements");
        for (int k = 0; k < n; k++) {
            //    array[k] = n.nextInt()(array[k]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (array[i] == array[j] && i != j) {
                    System.out.println ("The duplicate is " + array[i]);
                }

            }
        }


    }
}