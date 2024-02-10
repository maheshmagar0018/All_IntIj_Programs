package AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P2
{
    public static void main(String [] args)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Step 1 done");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Step 2 done");

            Statement stmt = con.createStatement();
            System.out.println("Step 3 done");

            stmt.executeUpdate("insert into product.productrecord values(6,'schezwan',31,2022,2023)");
            //stmt.executeUpdate("update product.productrecord set P_name='schezwan_chutney' where P_id=77");
            //stmt.executeUpdate("delete from product.productrecord where P_id = 77");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
