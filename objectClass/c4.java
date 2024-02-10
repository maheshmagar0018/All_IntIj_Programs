package objectClass;
import java.util.ArrayList;
import java.util.Collections;

public class c4
{
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(-25);
        //a.add("hi");  ClassCastException
        //a.add(null);  NullPointerException
        a.add(0);
        a.add(-500);
        a.add(100);
        a.add(-5);
        System.out.println("Before Sorting: "+ a);

        Collections.sort(a);
        System.out.println("After sorting ASC: "+a);

        Collections.reverse(a);
        System.out.println("After Sorting DESC: "+a);
    }
}
