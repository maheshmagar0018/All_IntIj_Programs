//WAP to print the factorial of the separated digits from the given number.
package basicProgram;

public class P19
{
    public static void main(String[] args)
    {
        int n = 652;
        while(n!=0)
        {
            int d = n % 10;
            n = n /10;
            int fact = 1;
            for(int i=1 ; i<=d ; i++)
            {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
