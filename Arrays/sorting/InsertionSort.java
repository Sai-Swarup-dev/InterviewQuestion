package InterviewQuestion.Arrays.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 55, 56, 88, 152, 75, 66, 120, 200, 156};

        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Insertion Sort method
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Loop through each element in the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
