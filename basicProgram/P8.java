//WAP to find the product of all the numbers in the range 1 to 5.
package basicProgram;

public class P8
{
    public static void main(String[] args)
    {
        int prod = 1;
        for(int i=1 ; i<=5 ; i++)
        {
            prod = prod * i;
        }
        System.out.println(prod);
    }
}
