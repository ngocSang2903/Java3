/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import JdbcUtil.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.QLPMModel;

/**
 *
 * @author Admin
 */
public class MenuRepository {

    public ArrayList<QLPMModel> FinddTrangThai(String TrangThai) {
        ArrayList<QLPMModel> list = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "select * from QuanLyTruyen where trangThai=N'" + TrangThai + "'";
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

    public ArrayList<QLPMModel> FindTheLoai(String TheLoai) {
        ArrayList<QLPMModel> list = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "select * from QuanLyTruyen where theLoai=N'" + TheLoai + "'";
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

    public ArrayList<QLPMModel> FindNam(int Nam) {
        ArrayList<QLPMModel> list = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "select * from QuanLyTruyen where namPhatHanh=" + Nam + "";
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
    
        public ArrayList<QLPMModel> FindTen(String Ten) {
        ArrayList<QLPMModel> list = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "select * from QuanLyTruyen where ten like N'%"+Ten+"%'";
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

}
