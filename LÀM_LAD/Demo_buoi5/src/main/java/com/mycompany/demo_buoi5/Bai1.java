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
public class Bai1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203;trustServerCertificate=true;";
            String user = "sa";
            String pass = "123456789";
            Connection con = DriverManager.getConnection(url, user, pass);

            Product p1 = new Product(8, "Áo thun cộc tay Mẫu 1", 200, 95000, "WHITE", 1);
            Product p2 = new Product(9, "Áo thun cộc tay Mẫu 2", 250, 105000, "GREEN", 1);
            Product p3 = new Product(10, "Quần đùi Mẫu 1", 100, 195000, "BLACK", 2);

            String sql = "insert into san_pham values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p1.getTenSP());
            ps.setInt(2, p1.getSoLg());
            ps.setString(3, p1.getMausac());
            ps.setDouble(4, p1.getDongia());
            ps.setInt(5, p1.getDanhMucId());
            ps.execute();

            ps.setString(1, p2.getTenSP());
            ps.setInt(2, p2.getSoLg());
            ps.setString(3, p2.getMausac());
            ps.setDouble(4, p2.getDongia());
            ps.setInt(5, p2.getDanhMucId());
            ps.execute();

            ps.setString(1, p3.getTenSP());
            ps.setInt(2, p3.getSoLg());
            ps.setString(3, p3.getMausac());
            ps.setDouble(4, p3.getDongia());
            ps.setInt(5, p3.getDanhMucId());
            ps.execute();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
