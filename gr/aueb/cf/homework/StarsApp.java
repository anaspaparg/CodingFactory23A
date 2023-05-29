package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * Displays a menu with 6 options and after user provides an input, it displays stars with different layout
 */
public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int choice = 0;
        int result = 0;

        do {
            printMenu();
            choice = in.nextInt();

            if (isChoiceInvalid(choice)) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (isChoiceQuit(choice)) {
                break;
            }

            result = onChoiceGetResult(choice);

        } while (true);

    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε τα αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε τα αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

//    public static int getNextInt(String message) {
//        System.out.println(message);
//        return in.nextInt();
//    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static void horStars(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void vertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void nRowsNStars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starsOneToN(int n) {

    }

    public static int onChoiceGetResult(int choice) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;

        switch (choice) {
            case 1:
                horStars(n);
                break;
            default:
                break;
        } return result;
    }


}
