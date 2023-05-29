package gr.aueb.cf.ch6;

public class missingArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(getMissing(arr));
    }

    public static int getMissing(int[] arr) {
        int n = arr.length;
        int sum = (n + 1) * (n + 2) / 2;
        int arrSum = 0;

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        return sum - arrSum;
    }
}
