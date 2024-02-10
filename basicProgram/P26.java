//WAP to swap the number. (Using 3rd variable)
package basicProgram;

public class P26
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = 5;
        System.out.println("Before Swapping");
        System.out.println("a "+a);
        System.out.println("b "+b);

        int temp = a;    // Using 3rd variable
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
