//WAP to find all the prime numbers in the array.
package arraysProgram;

public class P22
{
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<a.length;i++)
        {
             int count=0;
             for(int j=1;j<a.length;j++)
             {
                 if(a[i]%j==0)
                 {
                     count++;
                 }
             }
             if(count==2)
             {
                 System.out.println("The element is a prime no.: "+a[i]);
             }
        }
    }
}
