package objectClass;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class c8
{
    public static void main(String[] args)
    {
        HashSet h=new HashSet();
        h.add(10);
        h.add(25);
        h.add("hi");
        h.add(null);
        h.add(25);
        h.add("hi");
        h.add(null);
        System.out.println("HashSet: "+h);

        LinkedHashSet l=new LinkedHashSet();
        l.add(10);
        l.add(25);
        l.add("hi");
        l.add(null);
        l.add(25);
        l.add("hi");
        l.add(null);
        System.out.println("LinkedHashSet: "+l);

        TreeSet t=new TreeSet();
        t.add(35);
        t.add(0);
        // t.add("hi");   //ClassCastException
        // t.add(null);   //NullPointerException
        t.add(-50);
        t.add(100);
        t.add(-25);
        t.add(0);
        t.add(55);
        System.out.println("TreeSet ASC: "+t);
        System.out.println("TreeSet DESC: "+t.descendingSet());
    }
}
