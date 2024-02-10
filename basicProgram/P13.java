//WAP to print all the digits from the number.
package basicProgram;

public class P13
{
    public static void main(String[] args)
    {
        int n = 345;
        while(n!=0)
        {
            int d = n % 10;   // whenever the separate digits based question if they ask then we have to do modulus the given number by 10
            System.out.println(d);
            n = n/10;            //first n % 10 then n / 10
        }
    }
}
