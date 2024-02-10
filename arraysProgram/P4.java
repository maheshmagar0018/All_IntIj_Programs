//Create array--using new keyword
package arraysProgram;
import java.util.Scanner;
public class P4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] a =new int [n];       //datatype [] variable= new datatype [size];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the elements of the array");
            a[i]=sc.nextInt();
        }
        System.out.println("The elements are");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

/*
We will go for new keyword when we don't know the value of the array But we know the number of values.
 */