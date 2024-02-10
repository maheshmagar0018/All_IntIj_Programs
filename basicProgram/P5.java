//WAJP to check whether the given no. is a prime no. or not
package basicProgram;

public class P5
{
    public static void main(String[] args)
    {
        int n = 5;
        int count = 0;     // To check whether we have only two factors or not  ,initialize count with 0.
        for(int i = 1; i<=n;i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        if(count == 2)      //prime numbers has only two factors and this condition is taken
        {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
