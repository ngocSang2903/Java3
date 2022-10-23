/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TacGia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TacGiaRepository {

    public void insert(TacGiaModel tg) {
        try {
            Connection conn = jdbsUtil.getConnection();
            String sql = "insert into tac_gia (ten,sdt,email) values (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tg.getTen());
            ps.setInt(2, tg.getSodienthoai());
            ps.setString(3, tg.getEmail());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id,TacGiaModel tg) {
        try {
            Connection conn = jdbsUtil.getConnection();
            String sql = "update tac_gia set ten=?,sdt=?,email=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tg.getTen());
            ps.setInt(2, tg.getSodienthoai());
            ps.setString(3, tg.getEmail());
            ps.setInt(4, tg.getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public void delete(int id) {
        try {
            Connection conn = jdbsUtil.getConnection();
            String sql = "delete from tac_gia where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<TacGiaModel> all() {
        ArrayList<TacGiaModel> list = new ArrayList<>();
        try {
            Connection conn = jdbsUtil.getConnection();
            String sql = "select * from tac_gia";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int sdt = rs.getInt("sdt");
                String emal = rs.getString("email");
                TacGiaModel tgm = new TacGiaModel(id, ten, sdt, emal);
                list.add(tgm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
