//WAP to print the product of separated digits from the number.
package basicProgram;

public class P17
{
    public static void main(String[] args)
    {
        int n = 524;
        int prod = 1;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            prod = prod * d;
        }
        System.out.println(prod);
    }
}
