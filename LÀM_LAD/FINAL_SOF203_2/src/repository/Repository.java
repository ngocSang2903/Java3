/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Model.BanModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Repository {

    public ArrayList<BanModel> all() {
        ArrayList<BanModel> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select Id,Ten,SoThich,GioiTinh from dbo.Ban";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                String ma = rs.getString("Id");
                String ten = rs.getString("Ten");
                String sothich = rs.getString("SoThich");
                int Gioitinh = rs.getInt("GioiTinh");
                BanModel banModel = new BanModel(ma, ten, sothich, Gioitinh);
                list.add(banModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void update(String ma, BanModel banModel) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "update dbo.Ban set Ten=?,SoThich=?,GioiTinh=? where Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, banModel.getTen());
            ps.setString(2, banModel.getSothich());
            ps.setInt(3, banModel.getGioitinh());
            ps.setString(4, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "delete from dbo.Ban where Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
