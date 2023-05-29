package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * μετραει το πληθος των θετικων aριθμων που δινει ο χρηστης
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please give a num");
        num = in.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Please give a num");
            num = in.nextInt();
        }

        System.out.println("Positive-count: " + positiveCount);
    }
}
