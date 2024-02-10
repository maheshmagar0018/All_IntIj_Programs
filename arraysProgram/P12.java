package arraysProgram;

public class P12
{
    public static void main(String[] args) {
        int[] a={1,5,4,2,3};
        int small =Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.println("The smallest element is: "+small);
    }
}
