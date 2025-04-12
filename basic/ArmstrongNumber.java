package InterviewQuestion.basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num){
        int temp = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += Math.pow(digit, numberOfDigits); // Raise to the power and add to sum
            num /= 10; // Remove the last digit
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check armstrong Number: ");
        int num = sc.nextInt();
        System.out.println(num+" is armstrong? True or False: Answer = "+ isArmstrong(num));
    }
}
