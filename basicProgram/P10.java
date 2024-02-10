//WAP to find the sum of all the even numbers in the range of 1 to 10.
package basicProgram;

public class P10
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i=1 ; i<=10 ; i++)
        {
            if(i%2==0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
