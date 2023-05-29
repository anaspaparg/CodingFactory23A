package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * Displays a menu of 5 options and a method to read the user's input.
 * The method checks if user's input is an int or not.
 * We create a second method, which prints the user's input and checks if the choice is between 1-5,
 * otherwise creates exception
 */
public class ExceptionMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            printMenu();
            choice = in.nextInt();
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Δημιουργία");
        System.out.println("5. Έξοδος");
    }

    public static int getChoice(Scanner in) {
        System.out.println("Εισάγετε την επιλογή σας:");
        try {

            while (!in.hasNextInt()) {
                System.out.println("Παρακαλώ εισάγετε ακέραιο αριθμό");
                System.out.println("Εισάγετε ξανά την επιλογή σας:");
                in.nextInt();
            }
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.out.println("Παρακαλώ εισάγετε αριθμό");
        }
        return in.nextInt();
    }
}
