//WAP to reverse the elements of the array.
package arraysProgram;

public class P10
{
    public static void main(String[] args)
    {
        int []a={10,3,5,2,8};
        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
