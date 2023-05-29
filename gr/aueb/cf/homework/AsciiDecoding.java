package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * Takes a string, converts each character of the string to the Ascii number
 * converts the Ascii number back to a character and prints a string with the previous ascii of each character
 */
public class AsciiDecoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide a string to be ascii coded:");
        String s = in.nextLine();
        String sEncrypted = "";


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiCode = (int) ch;
            asciiCode -= 1;
            char ch1 = (char) asciiCode;
            sEncrypted += ch1;
        }
        System.out.println("The encrypted string is: " + sEncrypted + " ");
    }
}
