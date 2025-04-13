package InterviewQuestion.Arrays;

public class SecondMaximum {
    public static int secondMaximumEle(int arr[]){
        int max = arr[0];
        int secondMax = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("First maximum element: "+ max);
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = {11, 13, 55, 125, 33, 1000};
        System.out.print("Given array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Second Maximum element is: "+ secondMaximumEle(arr));
    }
}
