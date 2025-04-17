package InterviewQuestion.Pattern_Designs;

/*
    1 2 3 4 5
    10 9 8 7 6
    11 12 13 14 15
    20 19 18 17 16
    21 22 23 24 25
*/

import java.util.Scanner;

public class numPatternTwo {
    public static void main(String[] args) {
        int temp = 1;
        int temp1 = 5;
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2 != 0){
                    System.out.print(temp++ +" ");
                    temp1 = temp + n;
                }else{
                    System.out.print(--temp1+" ");
                    temp = temp1+n;
                }
            }
            System.out.println();
        }
        // System.out.println("-------------------------------------");
        snake();
    }


    public static void snake(){
        int temp1 = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp2 = n;

        //outerloop
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                //condition
                if(i%2 != 0){ //odd check condition
                    System.out.print(temp1++ +" ");
                    temp2 = temp1 + n;
                }else{ //even part
                    System.out.print(--temp2 +" ");
                    temp1 = temp2 + n;
                }
            }
            System.out.println();
        }
    }

}

