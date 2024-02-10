package objectClass;

import java.util.Scanner;

public class custom_e extends NullPointerException
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int n = sc.nextInt();
        if(n<18)
        {
            throw new custom_e();
        }
        else{
            System.out.println("I am eligible");
        }
    }
}
