package objectClass;
import java.util.ArrayList;
public class p4
{
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(25);
        a.add('c');
        a.add("hi");
        a.add(19.9);
        a.add(true);
        a.add(null);
        a.add(25);
        a.add(null);
        System.out.println(a);
        System.out.println(a.size());
    }
}
