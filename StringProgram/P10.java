//I/p -Meet me at the clock tower.
//O/p -M%%t #e AT th% ##o## TOWER.
package StringProgram;

public class P10
{
    public static void main(String[] args)
    {
        String s = "Meet me at the clock tower";
        String [] a = s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            if(i % 3 ==0)
            {
                System.out.print(vowel(a[i])+" ");
            }
            else if(i % 3 ==1)
            {
                System.out.print(consonant(a[i])+" ");
            }
            else if(i % 3 ==2)
            {
                System.out.print(uppercase(a[i])+" ");
            }
        }
    }
    public static String vowel(String s)
    {
        char [] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
            {
                c[i] = '%';
            }
        }
        return new String (c);
    }
    public static String consonant(String s)
    {
        char [] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u' && c[i]!='A' && c[i]!='E' && c[i]!='I' && c[i]!='O' && c[i]!='U')
            {
                c[i] = '#';
            }
        }
        return new String (c);
    }
    public static String uppercase(String s)
    {
        char [] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i] >= 'a' && c[i] <= 'z')
            {
                c[i] = (char)(c[i] - 32);
            }
        }
        return new String (c);
    }
}
