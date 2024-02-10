//WAP to print all the odd digits from the number.
package basicProgram;

public class P15
{
    public static void main(String[] args)
    {
        int n = 5843;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            if(d%2!=0)
            {
                System.out.println(d);
            }
        }
    }
}
