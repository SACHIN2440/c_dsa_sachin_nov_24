import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};  // Example array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array using Insertion Sort
        insertionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Current element to be inserted
            int j = i - 1;     // Index of the last element in the sorted portion of the array

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place the key after the element smaller than it
            arr[j + 1] = key;
        }
    }
}
