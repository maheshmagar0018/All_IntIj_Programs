package arraysProgram;

public class P20
{
    public static void main(String[] args)
    {
        int [] a={1,5,3,2,4};
        int search= 12;
        boolean b= false;
        for(int i=0;i<a.length;i++)
        {
            if(search==a[i])
            {
                System.out.println("The element is present at index: "+i);
                b=true;
                break;
            }
        }
        if(b==false)
        {
            System.out.println("Not present");
        }
    }
}
