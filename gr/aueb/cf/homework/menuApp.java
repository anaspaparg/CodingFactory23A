package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * shows a menu and asks user for his choice
 */
public class menuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;



        do {
            System.out.println("Please insert your choice");
            System.out.println("1. Εισαγωγη");
            System.out.println("2. Διαγραφη");
            System.out.println("3. Ενημερωση");
            System.out.println("4. Αναζητηση");
            System.out.println("5. Εξοδος");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιλεξατε εισαγωγη");
            } else if (choice == 2) {
                System.out.println("Επιλεξατε διαγραφη");
            } else if (choice == 3) {
                System.out.println("Επιλεξατε ενημερωση");
            } else if (choice == 4) {
                System.out.println("Επιλεξατε αναζητηση");
            } else if (choice == 5) {
                System.out.println("Επιλεξατε εξοδο");
            } else {
                System.out.println("Λαθος επιλογη");
            }

        } while (choice != 5) ;
        System.out.println("goodbye");
    }
}
