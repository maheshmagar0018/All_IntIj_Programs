//WAP to find the product of all the elements in the array.
package arraysProgram;

public class P8
{
    public static void main(String[] args)
    {
        int []a={10,3,5,2,8};
        int prod=1;
        for(int i=0;i<a.length;i++)
        {
            prod= prod *a[i];
        }
        System.out.println(prod);
    }
}
