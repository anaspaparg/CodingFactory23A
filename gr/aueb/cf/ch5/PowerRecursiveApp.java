package gr.aueb.cf.ch5;

/**
 * ypologizei to a^n anadromika
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    /**
     *     recursive a^n
     * @param a     the base
     * @param b     the power
     * @return      the power of a
     */
    public static float power(float a, float b) {
        if (b < 0) {
            return 1 / power(a,-b);
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a,b-1);
        }
    }
}
