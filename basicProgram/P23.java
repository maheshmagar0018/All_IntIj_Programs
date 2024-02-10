//WAP to print the given series.  2,1,3,4,7,11,18,29,..  << Lucas Series >> Starts from 2 and 1 // and Fibonacci Series Starts from 0 and 1.
package basicProgram;

public class P23
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 1 ; i<=8 ; i++)
        {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
