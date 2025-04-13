package InterviewQuestion.basic;

import java.util.Scanner;

public class ReverseString {
    
    public static String isReversed(String string){
        String revStr = "";
        for(int i=string.length()-1; i>=0; i--){
            revStr += string.charAt(i);
        }
        return revStr.trim().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();
        System.out.println("Orginal String: "+ str);
        System.out.println("Reversed String: "+ isReversed(str));
    }
}
