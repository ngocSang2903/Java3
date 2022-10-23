/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import JdbcUtil.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import model.QLPMModel;

/**
 *
 * @author Admin
 */
public class QLPMRepository {

    public void insert(QLPMModel ql) {
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "insert into QuanLyTruyen values (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, ql.getTen());
            ps.setString(2, ql.getTheLoai());
            ps.setString(3, ql.getTrangThai());
            ps.setInt(4, ql.getNamPhatHanh());
            ps.setInt(5, ql.getTap());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int ma, QLPMModel ql) {
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "update QuanLyTruyen set ten=?,theLoai=?,trangThai=?,namPhatHanh=?,Tap=? where maTruyen=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(6, ql.getMaTruyen());
            ps.setString(1, ql.getTen());
            ps.setString(2, ql.getTheLoai());
            ps.setString(3, ql.getTrangThai());
            ps.setInt(4, ql.getNamPhatHanh());
            ps.setInt(5, ql.getTap());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int ma) {
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "delete from QuanLyTruyen where maTruyen=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<QLPMModel> all() {
        ArrayList<QLPMModel> list = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "select * from QuanLyTruyen";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int maTruyen = rs.getInt("maTruyen");
                String ten = rs.getString("ten");
                String theLoai = rs.getString("theLoai");
                String trangThai = rs.getString("trangThai");
                int namPhatHanh = rs.getInt("namPhatHanh");
                int Tap = rs.getInt("Tap");
                QLPMModel ql = new QLPMModel(maTruyen, ten, theLoai, trangThai, namPhatHanh, Tap);
                list.add(ql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
        public ArrayList<QLPMModel> FIndTap(String Ten) {
        ArrayList<QLPMModel> list = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "select * from QuanLyTruyen where ten=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int maTruyen = rs.getInt("maTruyen");
                String ten = rs.getString("ten");
                String theLoai = rs.getString("theLoai");
                String trangThai = rs.getString("trangThai");
                int namPhatHanh = rs.getInt("namPhatHanh");
                int Tap = rs.getInt("Tap");
                QLPMModel ql = new QLPMModel(maTruyen, ten, theLoai, trangThai, namPhatHanh, Tap);
                list.add(ql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    

}
