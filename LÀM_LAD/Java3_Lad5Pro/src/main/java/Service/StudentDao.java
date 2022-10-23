/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class StudentDao {

    public boolean insert(Student sd) throws ClassNotFoundException, SQLException {
        String sql = "insert into Student values (?,?,?,?,?,?)";
        Connection con = Hepper.hepper.openConnection();
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, sd.getMa());
        st.setString(2, sd.getTen());
        st.setString(3, sd.getEmail());
        st.setString(4, sd.getSdt());
        st.setString(5, sd.getGioitinh());
        st.setString(6, sd.getDiachi());
        return st.executeUpdate() > 0;
    }

    public boolean update(Student sd) throws ClassNotFoundException, SQLException {
        String sql = "update Student set HoTen=?,Email=?,sodt=?,gioitinh=?,diachi=? where MaSV=?";
        Connection con = Hepper.hepper.openConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(6, sd.getMa());
        ps.setString(1, sd.getTen());
        ps.setString(2, sd.getEmail());
        ps.setString(3, sd.getSdt());
        ps.setString(4, sd.getGioitinh());
        ps.setString(5, sd.getDiachi());
        return ps.executeUpdate() > 0;
    }

    public boolean delete(String MaSV) throws ClassNotFoundException, SQLException {
        String sql = "delete from Student where MaSV=?";
        Connection con = Hepper.hepper.openConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, MaSV);
        return ps.executeUpdate() > 0;
    }

    public Student FindID(String ma) throws ClassNotFoundException, SQLException {
        String sql = "select * from Student where MaSV=?";

        Connection con = Hepper.hepper.openConnection();
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, ma);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            Student sd = new Student();
            sd.setMa(rs.getString("ma"));
            sd.setTen(rs.getString("ten"));
            sd.setEmail(rs.getString("email"));
            sd.setSdt(rs.getString("sdt"));
            sd.setGioitinh(rs.getString("gioitinh"));
            sd.setDiachi(rs.getString("diachi"));
            return sd;
        }
        return null;
    }
}
