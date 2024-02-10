// Missing element in the array.
package arraysProgram;

public class P19
{
    public static void main(String[] args)
    {
        int [] a={6,2,3,1,5};
        int n=a.length+1;
        int sum=0;
        int sum1=n*(n+1)/2;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int b=sum1-sum;
        System.out.println(b);
    }
}
