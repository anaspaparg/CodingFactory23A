package gr.aueb.cf.ch9;

import java.io.*;

public class CopyRowDataApp {
    public static void main(String[] args) {
        int b = 0;
        int count = 0;

        try (FileInputStream in = new FileInputStream("/Users/anastasiospapargyropoulos/Desktop/codingfactory4/Images/Paris.png");
             FileOutputStream out = new FileOutputStream("/Users/anastasiospapargyropoulos/Desktop/codingfactory4/Images/Create.png")) {

            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

//        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(""));
//             BufferedOutputStream out = new BufferedOutputStream(new FilterOutputStream("")))


    }
}
