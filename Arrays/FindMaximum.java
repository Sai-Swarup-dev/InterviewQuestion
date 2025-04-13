package InterviewQuestion.Arrays;

public class FindMaximum {
    public static int findMaximum(int a[]){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {11, 13, 55, 125, 33, 1000};
        System.out.println("Given array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Maximum element is: "+ findMaximum(arr));

    }
}
