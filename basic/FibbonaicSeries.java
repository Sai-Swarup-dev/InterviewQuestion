package InterviewQuestion.basic;

import java.util.Scanner;

class FibbonaciSeries{
    public static void findFibbonaciSeries(int lengthOfSeries){
        int first = 0;
        int second = 1;
        System.out.print(first +" "+ second);
        while(lengthOfSeries != 0 ){
            int c = first + second;
            System.out.print(" "+ c);
            first = second;
            second = c;
            lengthOfSeries--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int length = sc.nextInt();
        findFibbonaciSeries(length);
    }
}