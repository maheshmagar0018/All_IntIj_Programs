//WAP to find the product of all the odd numbers in the range of 1 to 10.
package basicProgram;

public class P11
{
    public static void main(String[] args)
    {
        int prod = 1;
        for(int i=1 ; i<=10 ; i++)
        {
            if(i%2!=0)
            {
                prod = prod * i;
            }
        }
        System.out.println(prod);
    }
}
