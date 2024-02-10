// try-catch finally
package objectClass;

public class e1
{
    public static void main(String []args)
    {
       System.out.println("Program begins");
       int a=30 ,b=0;
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception handled");
        }
        finally
        {
            System.out.println("Thank you");
        }
        System.out.println("program ends");
    }
}