package objectClass;
import java.util.LinkedList;
import java.util.Collections;
public class c6
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(-25);
        l.add(0);
        l.add(-500);
        l.add(100);
        l.add(-5);
        System.out.println("Vector: "+l);

        Collections.sort(l);
        System.out.println("After sorting ASC: "+l);

        Collections.reverse(l);
        System.out.println("After Sorting DESC: "+l);
    }
}
