/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SachRepository {

    public void insert(SachModel s) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "INSERT INTO sach(ten, so_luong, don_gia, tac_gia_id) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getTen());
            ps.setInt(2, s.getSoluong());
            ps.setDouble(3, s.getDongia());
            ps.setInt(4, s.getTacgia());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public void update(int id ,SachModel s) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "update sach set ten=?,so_luong=?,don_gia=?,tac_gia_id=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getTen());
            ps.setInt(2, s.getSoluong());
            ps.setDouble(3, s.getDongia());
            ps.setInt(4, s.getTacgia());
            ps.setInt(5, s.getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            public void delete(int id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "delete from sach where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<SachModel> all(){
        ArrayList<SachModel> list=new ArrayList<>();
        try {
            Connection conn=jdbcUtil.getConnection();
            String sql="select * from sach";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                int id=rs.getInt("id");
                String ten=rs.getString("ten");
                int tacgia=rs.getInt("tac_gia_id");
                Double dongia=rs.getDouble("don_gia");
                int soluong=rs.getInt("so_luong");
                SachModel s=new SachModel(id, ten, dongia, soluong, tacgia);
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
