package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * converts fahreneit to celcius
 */
public class FtoC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahreneitDegrees;
        int celciusDegrees;

        System.out.println("Please provide degrees in Fahreneit");
        fahreneitDegrees = in.nextInt();
        celciusDegrees = (5 * (fahreneitDegrees - 32) / 9);

        System.out.printf("Celsius degrees: %d", celciusDegrees);
    }
}
