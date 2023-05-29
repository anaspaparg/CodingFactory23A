package gr.aueb.cf.homework;

/**
 * finds the position of the maximum value of an array
 */
public class FindsMaxPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,6,1,9,8,4,3};
        int maxPosition = 0;
        maxPosition = getMaxPosition(arr, 0, 7);

        System.out.println("The maximum value is at position: " + (maxPosition + 1));

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low; // θεωρούμε ότι το μέγιστο είναι στην πρώτη θέση
        int maxVal = arr[low]; // θεωρούμε ότι το μέγιστο είναι το πρώτο στοιχείο

        for (int i = low + 1; i <= high; i++) { // Ξεκινάμε από τη δεύτερη θέση
            if (arr[i] > maxVal) { // Αν βρούμε μεγαλύτερο από το προηγούμενο μέγιστο
                maxVal = arr[i]; // Ανανεώνουμε το μέγιστο
                maxPosition = i; // Κρατάμε τη θέση του νέου μέγιστου
            }
        }

        return maxPosition; // Επιστρέφουμε τη θέση του μέγιστου
    }
}


