//WAP to check if the given number is palindrome number or not.
package basicProgram;

public class P22
{
    public static void main(String[] args)
    {
        int n = 121;
        int temp = n;
        int rev = 0;
        while(n!=0)
        {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        if(temp==rev)
        {
            System.out.println("It is a Palindrome number");
        }
        else{
            System.out.println("It's Not a Palindrome number");
        }
    }
}
