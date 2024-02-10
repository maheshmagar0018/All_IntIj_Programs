package arraysProgram;

public class P17
{
    public static void main(String[] args)
    {
        int [] a={3,2,4,5,1};
        for(int i=0;i<a.length;i++)
        {
            for(int j=1+i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        // to print the array
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
