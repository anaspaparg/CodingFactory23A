package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * μετατρεπει euro σε δολαρια ΗΠΑ
 * λαμβανει απο τον χρηστη ενα ακεραιο
 * που συμβολιζει το ποσο σε euros και μετατρεπει
 * σε δολαρια και εμφανιζει το τελικο αποτελεσμα
 */
public class EuroToUsdConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;

        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();
    }
}
