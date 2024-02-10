//WAP to find the total number of decrements operation to make each element of the array divisible by k.
package arraysProgram;

public class P30
{
    public static void main(String[] args)
    {
        int[]a={5,9,12,16,25};
        int k= 6;
        int sum= 0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+(a[i]%k);
        }
        System.out.println(sum);
    }
}
