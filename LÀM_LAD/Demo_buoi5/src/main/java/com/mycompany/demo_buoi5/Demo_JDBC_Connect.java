/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo_buoi5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class Demo_JDBC_Connect {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203;trustServerCertificate=true;";
        String username = "sa";
        String pass = "123456789";
        Connection con = DriverManager.getConnection(url, username, pass);

        Product p = new Product(0, "Áo thể thao", 9, 9999, "YELLOW", 6);
        String sql = "insert into san_pham values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getTenSP());
        ps.setInt(2, p.getSoLg());
        ps.setString(3, p.getMausac());
        ps.setDouble(4, p.getDongia());
        ps.setInt(5, p.getDanhMucId());
        ps.execute();

    }
}
