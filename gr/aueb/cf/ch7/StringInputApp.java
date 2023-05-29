package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please provide a string");
        s = in.next();  // ends with white space (space,tab \t,new line \n) , diavazei leksi
//        s = in.nextLine(); diavazei mia protasi

        System.out.println(s);
    }
}
