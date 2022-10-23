package com.mycompany.demo_buoi5;

import com.mycompany.demo_buoi5.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Delete {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203;trustServerCertificate=true;";
        String username = "sa";
        String pass = "123456789";
        Connection con = DriverManager.getConnection(url, username, pass);

        Product p = new Product(3, "Áo Len", 100, 300000, "BLACK", 6);
        String sql = "delete from san_pham where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, p.getId());
        ps.execute();
    }
}
