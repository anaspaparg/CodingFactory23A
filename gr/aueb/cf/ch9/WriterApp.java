package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriterApp {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("/Users/anastasiospapargyropoulos/Documents/Java/intfile.docx");
             PrintWriter pw = new PrintWriter("/Users/anastasiospapargyropoulos/Documents/Java/intfile1.docx")) {
            ps.println("Hello cf! From print stream");
            pw.println("Hello CF! From print writer");
            // an theloume na grafei kateytheian stin konsola xwris na kanei buffer xrisimopoioume to epomeno
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}
