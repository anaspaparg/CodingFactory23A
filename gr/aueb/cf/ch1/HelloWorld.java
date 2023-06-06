package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;

import java.util.Scanner;
import java.lang.*; // i monadiki pou ginetai automata kai den xreiazetai na tin eisagoume
import static java.lang.Math.abs;

/**
 * Εκτυπωνει hello world! στο
 * standard output (κονσολα)
 * @author anastasiospapargyropoulos
 */

public class HelloWorld {
    private Scanner sc = new Scanner(System.in);
    private Point point;
    private String s;

    public static void main(String[] args) {

        int abs = Math.abs(-3);
        System.out.print("Hello World");
    }
}

