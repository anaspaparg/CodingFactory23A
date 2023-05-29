package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Demonstrates the usage of exception
 */
public class ExceptApp {
    public static void main(String[] args) {

        int ch;

        try {
            ch = getNextChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("Error in I/O");
        }


    }

    public static int getNextChar() throws IOException {
        int ch = ' ';

        try {
            ch = System.in.read();
        } catch (IOException e) {
            // 1. Rollback
            // 2. Logging
            e.printStackTrace();

            //Rethrow
            throw e;
        }
        return ch;
    }
}
