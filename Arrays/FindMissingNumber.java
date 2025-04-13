package InterviewQuestion.Arrays;

import java.util.ArrayList;

public class FindMissingNumber {
    
    public static void missingNumberInArray(ArrayList<Integer> list){
        for (int i = 1; i <= list.get(list.size() - 1); i++) {
            if (!list.contains(i)) {
                System.out.println("Missing number is: " + i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);

        System.out.println("Origina array: "+ list);
        missingNumberInArray(list);
    }
}
