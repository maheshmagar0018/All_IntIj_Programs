//WAP all the elements in 2D array.
package arraysProgram;

public class P27
{
    public static void main(String[] args)
    {
        int [][] a={{1,2,3,4},{5,6,7,8}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
