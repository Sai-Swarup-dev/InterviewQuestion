package InterviewQuestion.Arrays;

import java.util.Arrays;

public class kthSmallestElement {
    
    public static void kthSmallestEle(int []arr, int k){
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<arr.length; i++){
            if(i == k-1){
                System.out.println();
                System.out.println("Kth smallest element is : "+ arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 9, 4} ;
        int k = 2;
        System.out.println("Given array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        kthSmallestEle(arr, k);
    }
}
