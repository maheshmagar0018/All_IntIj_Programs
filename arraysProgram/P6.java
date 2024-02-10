//WAP to print all the elements divisible by 3 in the array.
package arraysProgram;

public class P6
{
    public static void main(String[] args)
    {
        int [] a={3,4,5,6,7,8};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%3==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
