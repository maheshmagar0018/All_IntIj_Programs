//WAP to find the product of all the elements which are divisible by 7.
package arraysProgram;

public class P14
{
    public static void main(String[] args)
    {
        int [] a={6,7,14,16,28,29,35,36,37,38};
        int prod=1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%7==0)
            {
                prod=prod*a[i];
            }
        }
        System.out.println(prod);
    }
}
