//WAP to check whether the given number is Perfect number or not.  >> steps - factors (find) / sum / compare.
package basicProgram;

public class P12
{
    public static void main(String[] args)
    {
        int n = 6;
        int sum = 0;
        for(int i=1 ; i<n ; i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        if(n==sum)  // n means we have inserted the value and sum is works for addition of given numbers factor.
                    // expect the original number itself. for ex.(6==sum) sum--(1+2+3)=6 that's the perfect number.
        {
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is an imperfect number");
        }
    }
}
