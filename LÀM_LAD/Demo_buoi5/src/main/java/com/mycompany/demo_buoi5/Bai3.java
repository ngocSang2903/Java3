/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo_buoi5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Bai3 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203;trustServerCertificate=true;";
            String user = "sa";
            String pass = "123456789";
            Connection con = DriverManager.getConnection(url, user, pass);

            ArrayList<Product> list = new ArrayList<>();

            String sql = "select * from san_pham";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int soluong = rs.getInt("so_luong");
                String mausac = rs.getString("mau_sac");
                double dongia = rs.getDouble("don_gia");
                int danhmuc = rs.getInt("danh_muc_id");
                Product pro = new Product(id, ten, soluong, dongia, mausac, danhmuc);
                list.add(pro);
            }
            for (Product p : list) {
                System.out.print(p.getId() + " ");
                System.out.print(p.getTenSP() + " ");
                System.out.print(p.getSoLg() + " ");
                System.out.print(p.getMausac() + " ");
                System.out.print(p.getDongia() + " ");
                System.out.println(p.getDanhMucId());
            }
            System.out.println("Thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
