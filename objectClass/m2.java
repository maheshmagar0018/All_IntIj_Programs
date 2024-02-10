package objectClass;
import java.util.HashMap;
import java.util.Set;
public class m2
{
    public static void main(String[] args)
    {
        HashMap h=new HashMap();
        h.put(1,"sheela");
        h.put(0,'c');
        h.put('a',10);
        h.put(true,"bye");
        System.out.println("Map: "+h);
        System.out.println("Key: "+h.containsKey(10));
        System.out.println("Value: "+h.containsValue("sheela"));
        System.out.println("Value: "+h.values());
        System.out.println("Keys: "+h.keySet());

        //Map is converted into collection ---> entrySet()
        System.out.println("Set: "+h.entrySet());

        //To access Map one by one
        Set s=h.entrySet();
        for(Object obj:s)
        {
            System.out.println(obj);
        }
        System.out.println("Remove: "+h.remove('a'));

        h.clear();
        System.out.println("Map: "+h);
    }
}
