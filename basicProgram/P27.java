//WAP to swap 2 numbers.  [Without using 3rd variable]
package basicProgram;

public class P27
{
    public static void main(String[] args)
    {
        int a = 6;
        int b = 1;
        System.out.println("Before Swapping");
        System.out.println("a "+a);
        System.out.println("b "+b);

        a = a + b;        // a = 6 + 1 = 7
        b = a - b;        // b = 7 - 1 = 6
        a = a - b;        // a = 7 - 6 = 1
        System.out.println("After Swapping");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
