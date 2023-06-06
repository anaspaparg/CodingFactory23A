package gr.aueb.cf.homework.simpleclass;

/**
 * Driver class
 */
public class Main {
    public static void main(String[] args) {
        User anaspaparg = new User(1, "Anastasis", "Papargyropoulos");
        UserCredentials anaspaparg1 = new UserCredentials(1, "anaspaparg", "12345");

        System.out.println("{" + anaspaparg.getId() + "," + anaspaparg.getFirstname() + "," + anaspaparg.getLastname() + "}");
        System.out.println("{" + anaspaparg1.getId() + "," + anaspaparg1.getUsername() + "," + anaspaparg1.getPassword() + "}");
    }
}
