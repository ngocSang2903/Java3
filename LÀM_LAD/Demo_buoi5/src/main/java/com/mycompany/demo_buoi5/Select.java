/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo_buoi5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Select {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203;trustServerCertificate=true;";
        String username = "sa";
        String pass = "123456789";
        Connection con = DriverManager.getConnection(url, username, pass);
        ArrayList<Product> list = new ArrayList<>();
        Product p = new Product(7, "Áo Len", 100, 300000, "BLACK", 6);

        String sql = "update san_pham set ten=?,so_luong=?,mau_sac=?,don_gia=?,danh_muc_id=? where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.getResultSet();
        while (rs.next()) {
            int id=rs.getInt("id");
            String ten=rs.getString("ten");
            String mau=rs.getString("mau_sac");
            int so_lg=rs.getInt("so_luong");
            double don_Gia=rs.getDouble("don_gia");
             int danhmuc=rs.getInt("danh_muc_id");
             Product pro=new Product(id, ten, so_lg, don_Gia, mau, danhmuc);
             list.add(pro);
        }
    }
}
