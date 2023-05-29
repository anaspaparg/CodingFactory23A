package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/** reads from a file with data layout
 * country1 city1 city2 city3 ...
 * country2 city2 city3 city4 ...
 * writes every row in a different output file
 *
 * we use java.io
 */
public class CitiesIOApp {
    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("/Users/anastasiospapargyropoulos/Documents/Java/tmp");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make dir");
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("/Users/anastasiospapargyropoulos/Documents/Java/Cities.docx"))) {
            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + cities[0].toLowerCase().substring(0, 2) + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        File usaFile = new File(dir + "/" + cities[0].toLowerCase().substring(0, 2) + ".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        File deFile = new File(dir + "/" + cities[0].toLowerCase().substring(0, 2) + ".txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "Germany Cities");
                        print(de, cities);
                        break;
                    default:
                        System.err.println("Error in Cities");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }
    }
}