package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * prints N*N stars
 */
public class NxNStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int n = 0;

        System.out.println("Please provide number of stars to print");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
