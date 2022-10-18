package online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VendorDAO {
    public static final String TABLE_NAME = "app_vendor";

    public void createTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","karan038");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            String query="CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "(id bigint NOT NULL, "
                    + " name text, "
                    + " address text, "
                    + " phonenumber bigint,"
                    + " city text, "
                    + " state text, "
                    + " email text, "
                    + " CONSTRAINT app_vendor_pk PRIMARY KEY(id))";
            System.out.println("Create table quary "+query);
            stmt.executeUpdate(query);





        }catch
        (Exception ex){
            ex.printStackTrace();
        }
}
}
