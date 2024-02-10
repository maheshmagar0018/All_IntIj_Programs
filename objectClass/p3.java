package objectClass;
import java.util.*;
public class p3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("program begins");
        try
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic exception handled");
        }
        catch(InputMismatchException ie)
        {
            System.out.println("input mismatch exception handled");
        }
        System.out.println("Program Ends");
    }
}
