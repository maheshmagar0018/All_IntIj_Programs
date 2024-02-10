//WAP to print the sum of all the odd digits in the number.
package basicProgram;

public class P18
{
    public static void main(String[] args)
    {
        int n = 6352;
        int sum = 0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            if(d%2!=0)
            {
                sum = sum + d;
            }
        }
        System.out.println(sum);
    }
}
