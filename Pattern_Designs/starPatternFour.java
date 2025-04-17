package InterviewQuestion.Pattern_Designs;
/*
 * 
Output:
=========
 * * * * 
  * * * 
   * * 
    * 
 */
public class starPatternFour {
    public static void main(String[] args) {
        int sp = 0;
        int st = 4;
        for(int i=1; i<=4; i++){
            for(int k=0; k<=sp; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }

            System.out.println();
            sp++;
            st--;
        }
    }
}
