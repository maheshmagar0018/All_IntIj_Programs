//WAP to convert Decimal number into Binary number.
package basicProgram;

public class P29
{
    public static void main(String[] args)
    {
        int n = 12;
        String bin = " ";
        while(n!=0)
        {
            int r = n % 2;
            bin = bin + r;
            n = n / 2;
        }
        System.out.println(bin);
    }
}
