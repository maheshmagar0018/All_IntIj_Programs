package objectClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class c3
{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);   //int--->Integer--->Object
        a.add('c');
        a.add("hi");
        a.add(19.9);
        System.out.println("List: " + a);

        System.out.println("===get(index)===");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        System.out.println("===for_each===");
        for (Object obj : a) {
            System.out.println(obj);
        }

        System.out.println("===iterator()===");
        Iterator i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("===ListIterator()Forward===");
        ListIterator j = a.listIterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }

        System.out.println("===ListIterator()Backward===");
        while (j.hasPrevious())
        {
            System.out.println(j.previous());
        }
    }
}
