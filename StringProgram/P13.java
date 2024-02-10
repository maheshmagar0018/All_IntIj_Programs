package StringProgram;

public class P13
{
    public static void main(String[] args)
    {
        String a = "love";
        String b = "you";
        a = a.concat(b);
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
