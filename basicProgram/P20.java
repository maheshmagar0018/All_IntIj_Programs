//WAP to check whether the given number is special number or not.
package basicProgram;

public class P20
{
    public static void main(String[] args)
    {
        int n = 19;        //Steps for Special number - 1) Separate 2) Sum 3) Product 4) Add[S+P] 5) Compare
        int temp = n;
        int sum = 0;
        int prod = 1;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;     //Updation
            sum = sum + d;
            prod = prod * d;
        }
        int res = sum + prod;
        System.out.println(res);
        if(temp==res)
        {
            System.out.println("It is a Special number");
        }
        else{
            System.out.println("It's Not a Special number");
        }
    }
}
