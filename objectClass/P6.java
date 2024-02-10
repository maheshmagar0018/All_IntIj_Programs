package objectClass;

public class P6 implements Cloneable
{
    int i = 10;

    public static void main(String[] args) throws CloneNotSupportedException
    {
        P6 ref = new P6();
        ref.i=25;
        System.out.println("ref: "+ref.i);
        P6 ref1 = new P6();
        System.out.println("ref: "+ref1.i);
        Object obj = ref.clone();
    }
}
