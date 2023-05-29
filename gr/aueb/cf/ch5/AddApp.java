package gr.aueb.cf.ch5;

/**
 * prosthetei 2 akeraious me tin xrisi tis methodou add
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b);

        System.out.println(sum);
    }

    public static int add(int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;
        return a + b;
    }
}
