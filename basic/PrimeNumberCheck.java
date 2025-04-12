package InterviewQuestion.basic;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static boolean isPrime(int number){
        int count = 0;
        if(number < 1){
            return false;
        }
        for(int i=1; i<=number; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if the number is prime or not: ");
        int num = sc.nextInt();
        System.out.println(num+" is a prime number true or false? Answer: "+ isPrime(num));
    }
}
