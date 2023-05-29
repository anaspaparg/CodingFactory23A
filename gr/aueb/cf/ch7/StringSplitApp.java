package gr.aueb.cf.ch7;

/**
 * splits a string
 */
public class StringSplitApp {
    public static void main(String[] args) {
        String s = "Athens       Uni of Econ and Business";

        String[] tokens = s.split(" +"); // to + diavazei ena i perissotera kena (pti vrisketai pisw apo to +)

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
