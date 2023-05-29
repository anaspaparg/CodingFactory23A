package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * emfanizei ena menu kai o xristis dinei mia epilogi kai lamvanei
 * ena antistoixo feedback
 */
public class MenuChoiceApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλεξτε εν απο τα παρακατω");
            System.out.println("1. Εισαγωγη");
            System.out.println("2. Ενημερωση");
            System.out.println("3. Διαγραφη");
            System.out.println("4. Αναζητηση");
            System.out.println("5. Εξοδος");

            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Μηεγκυρη επιλογη");
                continue;
            }

            if (choice == 1) {
                System.out.println("Επιλεξατε εισαγωγη");
            } else if (choice == 2) {
                System.out.println("Επιλεξατε ενημερωση");
            } else if (choice == 3) {
                System.out.println("Επιλεξατε διαγραφη");
            } else {
                System.out.println("Επιλεξατε αναζητηση");
            }

        } while (choice != 5);
    }
}
