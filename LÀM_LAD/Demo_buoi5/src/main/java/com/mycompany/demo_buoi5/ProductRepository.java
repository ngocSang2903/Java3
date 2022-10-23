/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo_buoi5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ProductRepository {

    public void insert(Product p) {
        try {
            Connection conn = jdbcUtil.getconnection();
            String sql = "insert into san_pham values (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getTenSP());
            ps.setInt(2, p.getSoLg());
            ps.setString(3, p.getMausac());
            ps.setDouble(4, p.getDongia());
            ps.setInt(5, p.getDanhMucId());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(int id, Product p) {
        try {
            Connection conn = jdbcUtil.getconnection();
            String sql = "update san_pham set ten=?,so_luong=?,mau_sac=?,don_gia=?,danh_muc_id=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getTenSP());
            ps.setInt(2, p.getSoLg());
            ps.setString(3, p.getMausac());
            ps.setDouble(4, p.getDongia());
            ps.setInt(5, p.getDanhMucId());
            ps.setInt(6, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int ma) {
        try {
            Connection conn = jdbcUtil.getconnection();
            String sql = "delete from san_pham where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> all() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getconnection();
            String sql = "select * from san_pham";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String mau = rs.getString("mau_sac");
                int so_lg = rs.getInt("so_luong");
                double don_Gia = rs.getDouble("don_gia");
                int danhmuc = rs.getInt("danh_muc_id");
                Product pro = new Product(id, ten, so_lg, don_Gia, mau, danhmuc);
                list.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
