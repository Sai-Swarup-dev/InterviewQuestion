package InterviewQuestion.Arrays.sorting;
/*
Given array: 
12 55 56 88 152 75 66 120 200 156 
After Sorting: 
12 55 56 66 75 88 120 152 156 200 

 */
public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {12, 55, 56, 88, 152, 75, 66, 120, 200, 156};

        System.out.println("Given array: ");
        printArray(arr);

        bubbleSorting(arr);

        System.out.println("After Sorting: ");
        printArray(arr);
    }

    private static void bubbleSorting(int[] arr) {
        int lenArr = arr.length;
        boolean swapped = false;

        for(int j=0; j<lenArr-1; j++){
            for(int i=0; i<lenArr-1-j; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
    
            if (!swapped) {
                break;
            }
        }
    }

    //array printing
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
