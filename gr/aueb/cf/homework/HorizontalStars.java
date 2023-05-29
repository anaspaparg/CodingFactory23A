package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * prints n number of horizontal stars
 */
public class HorizontalStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int n = 0;

        System.out.println("Please provide number of stars to print");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
