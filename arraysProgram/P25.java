//Binary search.
package arraysProgram;

public class P25
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int search=2,li=0,hi=a.length-1,mi=(li+hi)/2;
        while(li<=hi)
        {
            if(search==a[mi])
            {
                System.out.println("The element is present at "+mi);
                break;
            }
            else if(search>a[mi])
            {
                li=mi+1;
            }
            else if(search<a[mi])
            {
                hi=mi+1;
            }
            mi=(li+hi)/2;
        }
    }
}
