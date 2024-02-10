//WAP to print all the factors of a numbers.
package basicProgram;

public class P4
{
    public static void main(String[] args)
    {
        int n = 6 ;
        System.out.println("Factors of " + n + " are: ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
