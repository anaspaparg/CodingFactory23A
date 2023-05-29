package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * takes 3 ints which represent day, month and year and displays them as dd/mm/yy
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.println("Please provide day, month and year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("Full date is: %02d/%d/%d", day, month, year);
    }
}
