/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khach_Hang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhachHangRepository {

    public ArrayList<KhachHangModel> all() {
        ArrayList<KhachHangModel> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "select * from khach_hang";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String diachi = rs.getString("dia_chi");
                String email = rs.getString("email");
                int tuoi = rs.getInt("tuoi");
                int gioitinh = rs.getInt("gioi_tinh");
                KhachHangModel kh = new KhachHangModel(id, ten, diachi, email, tuoi, gioitinh);
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(KhachHangModel khachhang) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "INSERT INTO khach_hang (ten, dia_chi, email, tuoi, gioi_tinh) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, khachhang.getTen());
            ps.setString(2, khachhang.getDiachi());
            ps.setString(3, khachhang.getEmail());
            ps.setInt(4, khachhang.getTuoi());
            ps.setInt(5, khachhang.getGioitinh());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void update(int id,KhachHangModel khachhang) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "update khach_hang set ten=?,dia_chi=?,email=?,tuoi=?,gioi_tinh=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, khachhang.getTen());
            ps.setString(2, khachhang.getDiachi());
            ps.setString(3, khachhang.getEmail());
            ps.setInt(4, khachhang.getTuoi());
            ps.setInt(6, khachhang.getId());
            ps.setInt(5, khachhang.getGioitinh());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public void delete(int id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "delete from khach_hang where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
