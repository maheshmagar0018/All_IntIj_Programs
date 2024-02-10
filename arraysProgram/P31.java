package arraysProgram;

public class P31
{
    public static void main(String[] args)
    {
        int [] [] a={{1,2,3},{4,5,6},{7,8,9}};
        int [] [] b={{1,2,1},{1,3,2},{1,1,0}};
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
