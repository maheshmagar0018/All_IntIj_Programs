//WAP to print all the Strings in lexographical order.
package StringProgram;

public class P14
{
    public static void main(String[] args)
    {
        String [] a = {"bangkok","japan","manali","kedarnath","bali"};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
