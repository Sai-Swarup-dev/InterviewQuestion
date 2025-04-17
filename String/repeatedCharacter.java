package InterviewQuestion.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class repeatedCharacter {

    public static void findRepeatedCharacter(String string){
        char []character = string.toCharArray();
        
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(Character ch : character){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", string);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scanner.nextLine();
        findRepeatedCharacter(string);
    }
}
