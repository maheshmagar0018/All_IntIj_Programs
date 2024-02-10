//find the second largest number of the array.
package arraysProgram;

public class P13
{
    public static void main(String[] args)
    {
        int[]a={10,4,3,5,12};
        int large=Integer.MIN_VALUE;
        int sLarge=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>large)
            {
                sLarge=large;
                large=a[i];
            } else if (a[i]>sLarge && a[i] !=large)
            {
                sLarge=a[i];
            }
        }
        System.out.println(" Large " + large);
        System.out.println(" SLarge " + sLarge);
    }
}
