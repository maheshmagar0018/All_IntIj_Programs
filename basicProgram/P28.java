//WAP to check whether the given number is Strong number or not.
// If the sum of the factorials of individual digit of the number is equal to the number itself ,then it is a Strong number.
// Steps for this program - 1) Separate 2) Factorial 3) Sum 4) Compare
package basicProgram;

public class P28
{
    public static void main(String[] args)
    {
        int n = 145;
        int temp = n;
        int sum = 0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            int fact = 1;
            for(int i = 1 ; i<=d ; i++)
            {
                fact = fact * i;
            }
            sum = sum + fact;
        }
        System.out.println(sum);
        if(temp==sum)
        {
            System.out.println("It is a Strong number");
        }
        else{
            System.out.println("It's Not a Strong number");
        }
    }
}
