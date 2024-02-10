package arraysProgram;

public class P15
{
    public static void main(String[] args)
    {
        int [] a={2,5,6,3,13,7};
        int small=Integer.MAX_VALUE;
        int sSmall=Integer.MAX_VALUE;
        int tSmall=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<small)
            {
                tSmall=sSmall;
                sSmall=small;
                small=a[i];
            }
            else if (a[i]<sSmall && a[i]!=tSmall)
            {
                tSmall=sSmall;
                sSmall=a[i];
            }
            else if (a[i]<tSmall && a[i] !=small)
            {
                tSmall=a[i];
            }
        }
        System.out.println(small);
        System.out.println(sSmall);
        System.out.println(tSmall);
    }
}
