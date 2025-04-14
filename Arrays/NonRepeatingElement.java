package InterviewQuestion.Arrays;

public class NonRepeatingElement {

    public static void nonRepeatingEle(int []arr){
        int len = arr.length;  
        for(int i=0; i<len; i++){
            int count = 0;
            for(int j=0; j<len; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            // System.out.println("count: "+ count +" arr[i]: "+ arr[i]);
            if( count == 1){
                System.out.println();
                System.out.println("The non-repeating element is: "+arr[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6};
        System.out.print("Given array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        nonRepeatingEle(arr);
    }
}
