/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo_buoi5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class Bai2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203;trustServerCertificate=true;";
            String user = "sa";
            String pass = "123456789";
            Connection con = DriverManager.getConnection(url, user, pass);
            Product p = new Product(8, "Áo thun cộc tay Mẫu 1", 200, 200000, "WHITE", 1);

            String sql = "update san_pham set ten=?,so_luong=?,mau_sac=?,don_gia=?,danh_muc_id=? where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getTenSP());
            ps.setInt(2, p.getSoLg());
            ps.setString(3, p.getMausac());
            ps.setDouble(4, p.getDongia());
            ps.setInt(5, p.getDanhMucId());
            ps.setInt(6, p.getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
