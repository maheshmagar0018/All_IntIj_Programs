//WAP to find the occurrence of each character in the String.
package StringProgram;

public class P5
{
    public static void main(String[] args)
    {
        String s = "maharashtra";
        char[] c = s.toCharArray();
        boolean [] b = new boolean[c.length];
        for(int i=0;i<s.length();i++)
        {
            if(b[i] == false)
            {
                int count = 1;
                for(int j=i+1;j<s.length();j++)
                {
                    if(c[i] == c[j])
                    {
                        count++;
                        b[j] = true;
                    }
                }
                System.out.println(c[i]+" "+count);
            }
        }
    }
}
