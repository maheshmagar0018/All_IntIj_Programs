//WAP to print all the odd elements of the array.
package arraysProgram;

public class P5
{
    public static void main(String[] args)
    {
        int [] a={10,3,5,2,8};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
