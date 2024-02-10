/*
Types of array.
* Single dimentional array:



* Multi-dimentional array:
-It is a type of array which is used to stored address of multiple array's
-here the data is stored in rows and column
-it is also known as array of array's

# Array using array literal
Syntax- datatype [] [] variable={{1,2,3,4},{1,2,3,4}};

# Array using new keyword.
Syntax- datatype [] [] variable =new datatype [size of outer array] [size of inner array]

#
 */
package arraysProgram;
public class P26
{
    public static void main(String[] args)
    {
        int[][] a={{1,2,3},{4,5,6}};
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[0][2]);
        System.out.println(a[1][1]);
    }
}