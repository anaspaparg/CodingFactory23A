package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * αποφασιζει αν χιονιζει η οχι με βαση
 * οχι μονο την θερμοκρασια αλλα και το
 * αν βρεχει. αν βρεχει και η θερμοκρασια
 * ειναι < 0, τοτε χιονιζει, αλλιως οχι
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if its raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0 );

        System.out.println("Is snowing: " + isSnowing);
    }
}
