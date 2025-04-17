package InterviewQuestion.Pattern_Designs;
/*
 Output:
 =========
 * * * * * 
 *   *   *
 * *   * *
 *   *   *
 * * * * * 
 
 */

public class starPatternFive {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // //outer-loop
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1||j==1||j==5||i==5||i+j==5||i+j==7)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
