//WAP to find the factorial of every numbers in the range 1 to 10. [1,2,6,24,120,720,5040,40320,362880,3628800]
package basicProgram;

public class P25
{
    public static void main(String[] args)
    {
        for(int n=1 ; n<=10 ; n++)
        {
            int fact = 1;
            for(int i=1 ; i<=n ; i++)
            {
                fact = fact * i;
            }
            System.out.println(n+" "+fact);
        }
    }
}