//WAP to print  the diagonal elements of the matrix.
package arraysProgram;

/*public class P29
{
    public static void main(String[] args)
    {
        int [] [] a={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i+j==a.length-1)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}*/
// One more way to solve this program.
public class P29
{
    public static void main(String[] args) {
        int [] [] a={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i][i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i+j==a.length-1)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}






