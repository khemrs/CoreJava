package classPractice;

import java.util.Scanner;

public class CeasarCipher {

    public static void main(String[] args) {
        String userInput;
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter your Sentence:");
        userInput = scanner.nextLine ();
        CeasarCipher sc = new CeasarCipher ();

        System.out.println ("Encrypted Text is:");
        String encryptedText = sc.encryptString (userInput);
        System.out.println (encryptedText);
        System.out.println ("Decrypted Text is:");
        System.out.println (sc.decryptString (encryptedText));
    }

    public String encryptString(String text) {
        int i;
        int let;
        int length = text.length ();
        char letter;
        char letter1;
        String encyptedText = "";
        for (i = 0; i < length; i++) {
            letter = text.charAt (i);
            if ((letter >= 65 && letter < 90) || (letter >= 97 && letter < 122)) {
                let = letter + 1;

            } else if (letter == 90 || letter == 122) {
                let = letter - 25;

            } else {
                let = letter;
            }
            letter1 = (char) let;
            encyptedText = encyptedText + letter1;

        }
        return encyptedText;
    }

    public String decryptString(String text) {
        int i;
        int let;
        int length = text.length ();
        char letter;
        char letter1;
        String decyptedText = "";
        for (i = 0; i < length; i++) {
            letter = text.charAt (i);
            if ((letter > 65 && letter <= 90) || (letter > 97 && letter <= 122)) {
                let = letter - 1;

            } else if (letter == 65 || letter == 97) {
                let = letter + 25;

            } else {
                let = letter;
            }
            letter1 = (char) let;
            decyptedText = decyptedText + letter1;

        }
        return decyptedText;
    }
}
