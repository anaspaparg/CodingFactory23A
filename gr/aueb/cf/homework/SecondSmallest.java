package gr.aueb.cf.homework;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 14, 3, 25, 12};

        int minVal;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            // find the min value
            minVal = arr[i];
            minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minPosition = j;
                }
            }

            //swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }

        for (int item : arr) {
            System.out.print(item + " ");

        }
        System.out.println();
        System.out.printf("The second smallest value is: %d", arr[1]);
    }
}
