package InterviewQuestion.basic;

import java.util.Scanner;

public class ReverseSentence {

    public static String reverseString(String str){
        String []revStr = str.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for(int i= revStr.length-1; i>=0; i--){
            stringBuilder.append(revStr[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Original Sentence: "+ sentence);
        System.out.println("Reversed Sentence: "+ reverseString(sentence));
    }
}