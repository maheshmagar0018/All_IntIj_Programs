package arraysProgram;

public class P3
{
    public static void add(Object i)
    {
        System.out.println(i);
    }

    public static void main(String[] args)
    {
        add(134);
        add(24.89);
        add(true);
        add(null);
        add('h');
        add("mahesh");
    }
}
/*
1-All the primitive values can be converted into Non-primitive type.
2-Non-primitive type can be upcasted into object class type.
3-Hence,all the primitive type can be (upcasted) converted into object class type.
 */