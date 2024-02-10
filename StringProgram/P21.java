package StringProgram;

public class P21
{
    public static void main(String[] args)
    {
        int x = 1;
        for(int r =1;r<=5;r++)
        {
            for(int c=1;c<=5;c++)
            {
                if(r>=c)
                {
                    System.out.print(x + " ");
                    x++;
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