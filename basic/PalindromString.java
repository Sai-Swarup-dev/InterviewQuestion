package InterviewQuestion.basic;

import java.util.Scanner;
public class PalindromString {

    public static boolean isPalindrome(String s){
        System.out.println("Given String: " + s);
        
        // Normalize the string by removing spaces and converting to lower case
        s = s.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        System.out.println("New String after reverse is: " + reversed);
        return s.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for Palindrome: ");
        String str = sc.nextLine();
        System.out.println(str +" is Palindrome ? "+ isPalindrome(str));
    }
    
}
