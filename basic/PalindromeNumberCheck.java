package InterviewQuestion.basic;

import java.util.Scanner;

public class PalindromeNumberCheck {

    public static boolean isPalNumber(int num){
        int rem;
        int rev = 0;
        int temp = num;

        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem ;
            num = num / 10; 
        }
        System.out.println("Rev: "+ rev);
        return temp == rev;
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check for Palindrome: ");
        int number = scanner.nextInt();
        System.out.println(number+" is palindrome, True or False ? Answer: "+ isPalNumber(number));
    }
}
