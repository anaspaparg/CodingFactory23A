package gr.aueb.cf.ch5;
/**
 * swaps mutually 2 values, given by user
  */

public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("a = " + a + " b = " + b);

    }

    /**     swaps a, b so a->b and b->a
     *
      */


    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
