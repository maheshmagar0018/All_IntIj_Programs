//WAP to reverse the String.
package StringProgram;

public class P3
{
    public static void main(String[] args)
    {
        String s = "thane";
        String rev ="";
        for(int i = s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}