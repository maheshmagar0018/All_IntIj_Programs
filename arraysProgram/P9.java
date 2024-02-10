//WAP to find the sum of all even elements in the array.
package arraysProgram;

public class P9
{
    public static void main(String[] args)
    {
        int[]a={10,3,5,2,8};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
    }
}
