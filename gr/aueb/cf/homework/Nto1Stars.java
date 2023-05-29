package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * Prints n to 1 stars
 */
public class Nto1Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int j = 0;

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
