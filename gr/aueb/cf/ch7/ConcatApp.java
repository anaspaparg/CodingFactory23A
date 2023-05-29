package gr.aueb.cf.ch7;

/**
 * Concatenates 2 or more strings.
 */
public class ConcatApp {
    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan";
        String lastname = "Androutsos";
        String fullname;
        String titlesFullName;

        fullname = title + firstname + lastname;
        titlesFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullname);
        System.out.println(titlesFullName);
    }
}
