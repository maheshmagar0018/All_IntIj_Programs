// Swastik  pattern
package StringProgram;

public class P19
{
    public static void main(String[] args)
    {
        for(int r =1;r<=5;r++)
        {
            for(int c=1;c<=5;c++)
            {
                if(r==3 || c==3 || (r==1 && c==1) || (r==2 && c==1) || (r==4 && c==5) || (r==5 && c==5) || (r==1 && c==4) || (r==1 && c==5) || (r==5 && c==1) || (r==5 && c==2))
                {
                    System.out.print("o  ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
