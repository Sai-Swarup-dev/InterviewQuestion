package InterviewQuestion.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate {

    public static List<Integer> removeDuplicates(ArrayList<Integer> list){

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(list.get(i));
            }
        }
        return uniqueList;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);

        Collections.sort(list);
        System.out.println("Original Array: "+ list);
        System.out.println("After Removing Duplicates: "+ removeDuplicates(list));
    }
}
