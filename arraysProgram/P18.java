package arraysProgram;

public class P18
{
    public static void main(String[] args)
    {
        char []a={'m','a','h','e','s','h'};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
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
