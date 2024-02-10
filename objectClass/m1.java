package objectClass;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class m1
{
    public static void main(String[] args)
    {
        HashMap h =new HashMap();
        h.put(1,"sheela");
        h.put(2,"sunny");
        h.put(3,"sheela");
        h.put(0,'c');
        h.put('a',10);
        h.put(true,"bye");
        h.put(null,null);
      //h.put(2,"mahesh"); //old value is placed by new value
        System.out.println("HashMap: "+h);

        LinkedHashMap l=new LinkedHashMap();
        l.put(1,"sheela");
        l.put(2,"sunny");
        l.put(3,"sheela");
        l.put(0,'c');
        l.put('a',10);
        l.put(true,"bye");
        l.put(null,null);
        System.out.println("LinkedHashMap: "+l);

        TreeMap t =new TreeMap();
        t.put(-5,'c');
        t.put(0,"hi");
        t.put(5,false);
      //t.put("bye",10);  ClassCastException
      //t.put(null,10.9);  NullPointerException
        t.put(25,null);
        t.put(-20,"hi");
        System.out.println("TreeMap ASC: "+t);
        System.out.println("TreeMap DESC: "+t.descendingMap());
    }
}
