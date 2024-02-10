package objectClass;
import java.util.ArrayList;
public class p5
{
    public static void main(String[] args)
    {
        ArrayList s=new ArrayList();
        s.add("idli");
        s.add("voda");
        s.add("dosa");
        s.add("uttappa");
        System.out.println("South: "+ s);

        ArrayList n=new ArrayList();
        n.add("vada pav");
        n.add("pohe");
        n.add("puran poli");
        n.add("butter chicken");
        n.add("alu vadi");
        System.out.println("North: "+ n);

        //s.add("biryani");
        s.add(0,"biryani"); //using index
        System.out.println("South: "+ s);

        //n.addAll(s);
        n.addAll(2,s);
        System.out.println("North: "+ n);

        System.out.println("Search: "+n.contains("idli"));
        System.out.println("Search: "+s.contains("misal pav"));
        System.out.println("Search: "+n.containsAll(s));

        //n.remove("butter chicken");  //using object
        n.remove(2); //using index

        n.clear();
        System.out.println("North: "+n);
    }
}
