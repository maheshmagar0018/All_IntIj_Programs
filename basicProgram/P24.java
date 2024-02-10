//WAP to check whether the given number is Niven number or not.
// -- If the number is divisible by the sum of all the digits is known as Niven number.
package basicProgram;

public class P24
{
    public static void main(String[] args)
    {
        int n = 24;
        int temp = n;
        int sum = 0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            sum = sum + d;
        }
        if(temp%sum==0)
        {
            System.out.println("It is a Niven number");
        }
        else{
            System.out.println("It's Not a Niven number");
        }
    }
}
