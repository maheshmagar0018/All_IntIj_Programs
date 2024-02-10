// MC Pattern
package StringProgram;

public class P24
{
    public static void main(String[] args)
    {
        for(int r =1;r<=5;r++)
        {
            //for(int c=1;c<=5;c++)
            for(int c=1;c<=10;c++)
            {
                if(c==1 || c==5 || (r==2 && c==2) || (r==2 && c==4) || (r==3 && c==3) ||
                        (r==1 && c>6) || (r==5 && c>6) || (r==2 && c==6)|| (r==3 && c==6) || (r==4 && c==6) )
                {
                    System.out.print("#  ");
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
