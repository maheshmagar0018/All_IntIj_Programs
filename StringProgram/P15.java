//I/p - Java is a programming language it is a high level language
//O/p - 3
package StringProgram;

public class P15
{
    public static void main(String[] args)
    {
        String s = "Java is a programming language it is a high level language";
        String [] a = s.split(" ");
        boolean [] b = new boolean[a.length];
        int duplicount = 0;
        for(int i=0;i<a.length;i++)
        {
            if(b[i]==false)
            {
                int count = 1;
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i].equals(a[j]))
                    {
                        count++;
                        b[j] = true;
                    }
                }
                if(count > 1)
                {
                    duplicount++;
                }
            }
        }
        System.out.println(duplicount);
    }
}
