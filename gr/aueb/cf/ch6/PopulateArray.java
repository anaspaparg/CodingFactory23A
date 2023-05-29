package gr.aueb.cf.ch6;

/**
 * dilwsi kai arxikopoiisi pinaka
 * populate (eisagwgi pinaka)
 */
public class PopulateArray {
    public static void main(String[] args) {

        // dilwsi kai arxikopoiisi pinaka me lenght
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

//        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int item : arr) {
            System.out.println(item + " ");
        }
    }

        //unsized initiliation
        int[] arr2 = {1, 5, 8, 9, 12};

        //Array initilizer
        int[] arr3 = new int[] {4, 6, 9, 10};

}
