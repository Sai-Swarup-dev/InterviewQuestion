package InterviewQuestion.Pattern_Designs;
/*
output:
========
1 
3 2 
4 5 6 
10 9 8 7 
11 12 13 14 15 

 */

public class numPatternFive {
    public static void main(String[] args){

        int count;
        int n = 5;
        //outer-loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            if (i % 2 != 0) {
                count = (i*(i-1))/2+1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(count++ + " ");
                }
            } else {
                count = (i*(i+1))/2;
                for (int j = 1; j <= i; j++) {
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }
    }
}
