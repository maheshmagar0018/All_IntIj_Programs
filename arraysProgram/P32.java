// Multiplication of 2 matrices.
package arraysProgram;

public class P32
{
    public static void main(String[] args)
    {
        int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b= {{1,2,1},{1,3,2},{1,1,0}};
        // Creating another matrix to store the multiplication of 2 matrices.
        int [][] c= new int [3][3];   //3 rows and 3 columns
        //Multiplying and printing multiplication of 2 matrices.
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                {
                    for(int k=0;k<3;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                    }  // End of k loop
                    System.out.print(c[i][j]+" ");    //Printing matrix element.
                }
            }  //End of j loop
            System.out.println();  //New line
        }
    }
}
