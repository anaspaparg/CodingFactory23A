package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * calculates a power n
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        int result = 1;


        System.out.println("Please insert base, power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result * a;
        }

        System.out.println("Result: " + result);
    }
}
