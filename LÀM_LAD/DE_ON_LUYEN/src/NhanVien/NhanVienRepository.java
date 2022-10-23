/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class NhanVienRepository {

    public ArrayList<NhanVienModel> all() {
        ArrayList<NhanVienModel> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "select * from nhan_vien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String ma = rs.getString("ma_nv");
                String sdt = rs.getString("sdt");
                int tuoi = rs.getInt("tuoi");
                int vaitro = rs.getInt("vai_tro");
                NhanVienModel nhanVienModel = new NhanVienModel(id, ten, ma, sdt, tuoi, vaitro);
                list.add(nhanVienModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(NhanVienModel nhanVienModel) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "INSERT INTO nhan_vien (ten, ma_nv, sdt, tuoi, vai_tro) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nhanVienModel.getTen());
            ps.setString(2, nhanVienModel.getMa());
            ps.setString(3, nhanVienModel.getSodt());
            ps.setInt(4, nhanVienModel.getTuoi());
            ps.setInt(5, nhanVienModel.getVaitro());
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id, NhanVienModel nhanVienModel) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "update nhan_vien set ten=?,ma_nv=?,sdt=?,tuoi=?,vai_tro=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nhanVienModel.getTen());
            ps.setString(2, nhanVienModel.getMa());
            ps.setString(3, nhanVienModel.getSodt());
            ps.setInt(4, nhanVienModel.getTuoi());
            ps.setInt(5, nhanVienModel.getVaitro());
            ps.setInt(6, id);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "delete from nhan_vien where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
