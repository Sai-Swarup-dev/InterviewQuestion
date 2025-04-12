package InterviewQuestion.basic;

import java.util.Scanner;

public class Factorial {
    public static int factorialNumber(int n){
        if(n <= 1){
            return 1;
        }
        int i=1;
        int fact = 1;
        while(n != 0){
            fact *= i;
            i++;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of "+ number +" is: "+ factorialNumber(number));
    }
}
