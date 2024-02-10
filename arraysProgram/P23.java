// WAP to find the triplet in the array whose sum is equal to a number.
package arraysProgram;

public class P23
{
    public static void main(String[] args)
    {
        int [] a={1,2,3,4,5};
        int k=9;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int m=j+1;m<a.length;m++)
                {
                    if(a[i]+a[j]+a[m]==k)
                    {
                        System.out.println(a[i]+" "+a[j]+" "+a[m]);
                    }
                }
            }
        }
    }
}
