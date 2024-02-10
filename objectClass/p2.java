package objectClass;

public class p2
{
     public static void main(String[]args)
     {
         System.out.println("program begins");
         try
         {
             System.out.println(10/0);
         }
         catch(ArithmeticException ae)
         {
             System.out.println("Exception handled");
         }
         System.out.println("program ends");
     }
}
