package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {
    public static void main(String[] args) {
        File file = new File("/Users/anastasiospapargyropoulos/Documents/Java/Homework/Week 4");

        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("");
        } catch (IOException e2) {
            System.out.println("File not found error");
        } catch (Exception e3) {
            System.out.println("Oooops something went wrong");
        }
    }
}
