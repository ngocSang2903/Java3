/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVienDiem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class QuanLySinhVienDiemService {

    private ArrayList<SinhVienDiem> ls;

    public QuanLySinhVienDiemService() {
        this.ls = new ArrayList<>();
    }

    public ArrayList<SinhVienDiem> getlist() {
        return ls;
    }

    public void setList(ArrayList<SinhVienDiem> ls) {
        this.ls = ls;
    }

    public boolean insert(SinhVienDiem svd) throws ClassNotFoundException, SQLException {
        String sql = "insert GRADE values (?,?,?,?)";
        Connection con = Hepper.hepper.OpenConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, svd.getMaSV());
        ps.setDouble(2, svd.getTAnh());
        ps.setDouble(3, svd.getTHoc());
        ps.setDouble(4, svd.getGduc());
        return ps.executeUpdate() > 0;
    }

    public boolean update(SinhVienDiem svd) throws ClassNotFoundException, SQLException {
        String sql = "update GRADE set TiengAnh=?,"
                + "TinHoc=?,"
                + "GDTC=? "
                + "where MASV=?";
        Connection con = Hepper.hepper.OpenConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, svd.getMaSV() + "");
        ps.setDouble(1, svd.getTAnh());
        ps.setDouble(2, svd.getTHoc());
        ps.setDouble(3, svd.getGduc());
        return ps.executeUpdate() > 0;
    }

    public boolean delete(String Masv) throws ClassNotFoundException, SQLException {
        String sql = "delete from GRADE where MASV=?";
        Connection con = Hepper.hepper.OpenConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, Masv);
        return ps.executeUpdate() > 0;
    }

    public void LoadGRADE() throws ClassNotFoundException, SQLException {
        Connection con = Hepper.hepper.OpenConnection();
        Statement st = con.createStatement();
        String sql = "select top 3 HoTen,STUDENT.MASV,TiengAnh,TinHoc,GDTC from"
                + " STUDENT join GRADE on STUDENT.MASV=GRADE.MASV"
                + " order by (TiengAnh+TinHoc+GDTC)/3 desc";
        ResultSet rs = st.executeQuery(sql);
        ls.clear();
        while (rs.next()) {
            String TenSV = rs.getString(1);
            String MaSV = rs.getString(2);
            double tienganh = rs.getDouble(3);
            double tinhoc = rs.getDouble(4);
            double giaoductc = rs.getDouble(5);
            SinhVienDiem svd = new SinhVienDiem(MaSV, TenSV, tienganh, tinhoc, giaoductc);
            ls.add(svd);
        }
    }

    public SinhVienDiem findMaSV(String Ma) throws SQLException, ClassNotFoundException {
        Connection con = Hepper.hepper.OpenConnection();
        String sql = "select HoTen,STUDENT.MASV,TiengAnh,TinHoc,GDTC "
                + "from STUDENT join GRADE on STUDENT.MASV=GRADE.MASV"
                + " where STUDENT.MASV=?";
//        String sql="select Hoten,MASV from STUDENT where MASV=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, Ma);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            SinhVienDiem svd=new SinhVienDiem();
            svd.setMaSV(rs.getString("MASV"));
            svd.setTenSV(rs.getString("HoTen"));
            svd.setTAnh(rs.getDouble("TiengAnh"));
            svd.setTHoc(rs.getDouble("TinHoc"));
            svd.setGduc(rs.getDouble("GDTC"));
            return svd;
        }
        return null;
    }

}
