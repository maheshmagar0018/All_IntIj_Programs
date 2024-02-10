//WAP to remove a particular character from the String.
//I/p - Karnataka
//O/p - Krntk
package StringProgram;

public class P11
{
    public static void main(String[] args)
    {
        String s = "Karnataka";
        char [] c = s.toCharArray();
        for (int i = 0; i <c.length; i++)
        {
            if(c[i] != 'a')
            {
                System.out.print(c[i]);
            }
        }
    }
}
