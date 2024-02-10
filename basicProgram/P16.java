//WAP to print the sum of separated digits from the number.
package basicProgram;

public class P16
{
    public static void main(String[] args)
    {
        int n = 4259;
        int sum = 0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            sum = sum + d;
        }
        System.out.println(sum);
    }
}
