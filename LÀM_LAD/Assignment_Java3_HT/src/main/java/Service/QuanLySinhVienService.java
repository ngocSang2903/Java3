/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLySinhVienService {

    private ArrayList<SinhVien> list;

    public QuanLySinhVienService() {
        this.list = new ArrayList<>();
    }

    public ArrayList<SinhVien> getlist() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public boolean insert(SinhVien sv) throws ClassNotFoundException, SQLException {
        String sql = "insert into STUDENT values (?,?,?,?,?,?,?)";
        Connection con = Hepper.hepper.OpenConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sv.getMasv());
        ps.setString(2, sv.getHoten());
        ps.setString(3, sv.getEmail());
        ps.setString(4, sv.getSodt() + "");
        ps.setString(5, sv.getGioitinh());
        ps.setString(6, sv.getDiachi());
        ps.setString(7, sv.getHinhanh());
        return ps.executeUpdate() > 0;
    }

    public boolean update(SinhVien sv) throws ClassNotFoundException, SQLException {
        String sql = "update STUDENT set HoTen =?,Email  =?,SoDT  =?,GioiTinh  =?,DiaChi  =?,Hinh  =? where MASV=?";
        Connection con = Hepper.hepper.OpenConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(7, sv.getMasv());
        ps.setString(1, sv.getHoten());
        ps.setString(2, sv.getEmail());
        ps.setString(3, sv.getSodt() + "");
        ps.setString(4, sv.getGioitinh());
        ps.setString(5, sv.getDiachi());
        ps.setString(6, sv.getHinhanh());
        return ps.executeUpdate() > 0;
    }

    public boolean delete(String ma) throws ClassNotFoundException, SQLException {
        String sql = "delete from STUDENT where MASV=?";
        Connection con = Hepper.hepper.OpenConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ma);
        return ps.executeUpdate() > 0;
    }

    public void LoadStudent() throws ClassNotFoundException, SQLException {
        Connection con = Hepper.hepper.OpenConnection();
        Statement st = con.createStatement();
        String sql = "select * from STUDENT";
        ResultSet rs = st.executeQuery(sql);
        list.clear();
        while (rs.next()) {
            String MaSV = rs.getString(1);
            String TenSV = rs.getString(2);
            String Email = rs.getString(3);
            int sodT = rs.getInt(4);
            String Gioitinh = rs.getString(5);
            String diaChi = rs.getString(6);
            String hinh = rs.getString(7);
            SinhVien sv = new SinhVien(MaSV, TenSV, Email, sodT, Gioitinh, diaChi, hinh);
            list.add(sv);
        }
    }

}
