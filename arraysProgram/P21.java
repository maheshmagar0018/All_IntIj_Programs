package arraysProgram;

public class P21
{
    public static void main(String[] args)
    {
        int []a ={3,2,1,5,4};
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
