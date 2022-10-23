/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.SinhVienDiem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLySinhVienDiemRepository {

    public void insert(SinhVienDiem svd) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "insert into GRADE (MASV,TiengAnh,TinHoc,GDTC) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, svd.getMaSV());
            ps.setDouble(2, svd.getTAnh());
            ps.setDouble(3, svd.getTHoc());
            ps.setDouble(4, svd.getGduc());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String ma, SinhVienDiem svd) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "update GRADE set TiengAnh=?,TinHoc=?,GDTC=? where MASV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(4, svd.getMaSV());
            ps.setDouble(1, svd.getTAnh());
            ps.setDouble(2, svd.getTHoc());
            ps.setDouble(3, svd.getGduc());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "delete from GRADE where MASV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SinhVienDiem> all() {
        ArrayList<SinhVienDiem> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "select top 3 HoTen,STUDENT.MASV,TiengAnh,TinHoc,GDTC "
                    + "from STUDENT join GRADE on STUDENT.MASV=GRADE.MASV"
                    + " order by (TiengAnh+TinHoc+GDTC)/3 desc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()==true) {
                String ma = rs.getString("MASV");
                String tenSV = rs.getString("HoTen");
                double tienganh = rs.getDouble("TiengAnh");
                double tinhoc = rs.getDouble("TinHoc");
                double GDTC = rs.getDouble("GDTC");
                SinhVienDiem svd = new SinhVienDiem(ma, tenSV, tienganh, tinhoc, GDTC);
                list.add(svd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public SinhVienDiem findMa(String ma) {
        try {
            Connection conn = jdbcUtil.jdbcUtil.getConnection();
            String sql = "select HoTen,MASV from STUDENT where MASV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()==true) {
                SinhVienDiem svd = new SinhVienDiem();
                svd.setMaSV(rs.getString("MASV"));
                svd.setTenSV(rs.getString("HoTen"));
                return svd;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
