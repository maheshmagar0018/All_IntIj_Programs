//wap to swap the numbers without using 3rd variable
package objectClass;
class p22
{
    public static void main(String[] args)
    {
        int a = 6;
        int b = 1;
        System.out.println("before swapping");
        System.out.println("a" + a);
        System.out.println("b" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping");
        System.out.println("a" + a);
        System.out.println("b" + b);
    }
}