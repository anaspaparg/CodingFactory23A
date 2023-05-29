package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * lamvanei 3 times apo ton xristi, tis a, b kai c opou
 * a einai i upotinousa kai b,c oi 2 pleyres
 *
 * elegxei an to trigwno einai orthogwnio diladi an
 * a^2 == b^2 + c^2
 * kai EPSILON == 0.000005
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please provide a, b and c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("is triangle");
        } else {
            System.out.println("is not triangle");
        }
    }
}
