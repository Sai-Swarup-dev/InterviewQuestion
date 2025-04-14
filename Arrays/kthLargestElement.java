package InterviewQuestion.Arrays;

import java.util.Arrays;

public class kthLargestElement {

    public static int kthLargestEle(int []arr, int k){
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int kthLarge = arr[0];
        for(int i=0; i<=k; i++){
            if(arr[i] > kthLarge){
                kthLarge = arr[i];
            }
        }
        return kthLarge;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 90, 40 };
        int k = 2;
        System.out.println("Given array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n"+"Kth Largest element is: "+ kthLargestEle(arr, k));
    }
}
