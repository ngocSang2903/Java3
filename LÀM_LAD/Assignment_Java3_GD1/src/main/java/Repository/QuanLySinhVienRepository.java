/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLySinhVienRepository {

    public void insert(SinhVien sv) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "insert into STUDENT (MASV,HoTen,Email,SoDT,GioiTinh,DiaChi,Hinh) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sv.getMasv());
            ps.setString(2, sv.getHoten());
            ps.setString(3, sv.getEmail());
            ps.setInt(4, sv.getSodt());
            ps.setString(5, sv.getGioitinh());
            ps.setString(6, sv.getDiachi());
            ps.setString(7, sv.getHinhanh());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String ma, SinhVien sv) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "update STUDENT set HoTen =?,Email  =?,SoDT  =?,GioiTinh  =?,DiaChi  =?,Hinh  =? where MASV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(7, sv.getMasv());
            ps.setString(1, sv.getHoten());
            ps.setString(2, sv.getEmail());
            ps.setInt(3, sv.getSodt());
            ps.setString(4, sv.getGioitinh());
            ps.setString(5, sv.getDiachi());
            ps.setString(6, sv.getHinhanh());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "delete from STUDENT where MASV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SinhVien> all() {
        ArrayList<SinhVien> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "select * from STUDENT";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()==true) {
                String ma = rs.getString("MASV");
                String hoten = rs.getString("HoTen");
                String email = rs.getString("Email");
                int sodt = rs.getInt("SoDT");
                String Gioitinh = rs.getString("GioiTinh");
                String diachi = rs.getString("DiaChi");
                String hinh = rs.getString("Hinh");
                SinhVien sv = new SinhVien(ma, hoten, email, sodt, Gioitinh, diachi, hinh);
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insertexcel(String excelMa, String excelHoten, String excelEmail, int excelSodt, String excelgt, String exceldiachi, String excelanh) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "insert into STUDENT (MASV,HoTen,Email,SoDT,GioiTinh,DiaChi,Hinh) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, excelMa);
            ps.setString(2, excelHoten);
            ps.setString(3, excelEmail);
            ps.setInt(4, excelSodt);
            ps.setString(5, excelgt);
            ps.setString(6, exceldiachi);
            ps.setString(7, excelanh);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
