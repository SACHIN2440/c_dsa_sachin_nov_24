public class QuickSort {

    // Main function that implements QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Helper function to partition the array
    private static int partition(int[] arr, int low, int high) {
        // Pivot element is taken to be the last element
        int pivot = arr[high];
        int i = (low - 1);  // index of smaller element

        // Loop through the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (pivot element)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // return the pivot index
    }

    // Driver function to test the quickSort
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

