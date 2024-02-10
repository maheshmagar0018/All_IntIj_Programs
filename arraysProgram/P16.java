package arraysProgram;

public class P16
{
    public static void main(String[] args) {
        int [] a={12,1,4,3,5,12};
        int small=Integer.MAX_VALUE;
        int sSmall=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<small)
            {
                sSmall=small;
                small=a[i];
            }
            else if(a[i]<sSmall && a[i]!=small)
            {
                sSmall=a[i];
            }
        }
        System.out.println("The smallest element is: "+small);
        System.out.println("The Second smallest element is: "+sSmall);
    }
}
