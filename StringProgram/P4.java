//WAP to check if the String is palindrome or not.
package StringProgram;

public class P4
{
    public static void main(String[] args)
    {
        String s = "  Level  ";
        s = s.trim();
        String rev = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev))
        {
            System.out.println("The String is palindrome");
        }
        else{
            System.out.println("The String is not palindrome");
        }
    }
}
