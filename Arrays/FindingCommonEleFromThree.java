package InterviewQuestion.Arrays;

import java.util.ArrayList;

class FindingCommonElementFromThree{

    public static void findCommonElement(int a1[], int a2[], int a3[]){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a2.length; j++){
                for(int k=0; k<a3.length; k++){
                    if(a1[i] == a2[j] && a1[i] == a3[k] && a2[j] == a3[k]){
                        list.add(a1[i]);
                    }
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int a1[] = {1, 5, 10, 20, 40, 80};
        int a2[] = {6, 7, 20, 80, 100};
        int a3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        findCommonElement(a1, a2, a3);
    }
}