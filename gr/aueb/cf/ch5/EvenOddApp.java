package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * decides if a number is odd or even
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Please insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isNumEven);

    }

    /**
     * evaluates an int if its even or not
     * @param n     the number (int) to evaluate
     * @return      true if n is even, false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
