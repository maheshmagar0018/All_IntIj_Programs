package objectClass;
import java.util.ArrayList;
import java.util.HashSet;
public class c9
{
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add('c');
        a.add(10);
        a.add("hi");
        a.add('c');
        System.out.println("List: "+a);

        //converting list into set
        HashSet h =new HashSet(a);
        System.out.println("Set: "+h);

        //converting set into list
        ArrayList a1 =new ArrayList(h);
        System.out.println("List: "+a1);

        //Map into list
        //1.Map into set-->entrySet()
        //2.Set into list

        //converting collection / ArrayList into Array
        Object [] i=a.toArray();
    }
}
