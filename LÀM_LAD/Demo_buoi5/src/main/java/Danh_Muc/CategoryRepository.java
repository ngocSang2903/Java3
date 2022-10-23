/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Danh_Muc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CategoryRepository {

    public void insert(Category c) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "insert into danh_muc values (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getTen());
            ps.setString(2, c.getMota());
            ps.setString(3, c.getTrangthai());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Category c) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "update danh_muc set ten=?,mo_ta=?,trang_thai=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getTen());
            ps.setString(2, c.getMota());
            ps.setString(3, c.getTrangthai());
            ps.setInt(4, c.getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "delete from danh_muc where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Category> all(){
        ArrayList<Category> list=new ArrayList<>();
        try {
            Connection conn=jdbcUtil.getConnection();
            String sql="select * from danh_muc";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {        
                int id=rs.getInt("id");
                String ten=rs.getString("ten");
                String mota=rs.getString("mo_ta");
                String trangthai=rs.getString("trang_thai");
                Category c=new Category(id, ten, mota, trangthai);
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
