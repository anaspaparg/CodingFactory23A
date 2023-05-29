package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * αποφασιζει αν πρεπει να αναψουν τα φωτα
 * ενος αυτοκινητου με βαση τρεις μεταβλητες:
 * αν βρεχει και ταυτοχρονα ισχυει ενα τουλαχιστον
 * απο τα επομενα: ειναι σκοταδι η τρεχουμε
 * (speed > 100). Τις τιμεσ τις λαμβανουμε απο τον χρηστη
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if its dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On: " + lightsOn);
    }
}
