package InterviewQuestion.Pattern_Designs;
/*
Output:
==========
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

 */
public class starPatternTwo {
    public static void main(String[] args) {
        int len = 5;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
