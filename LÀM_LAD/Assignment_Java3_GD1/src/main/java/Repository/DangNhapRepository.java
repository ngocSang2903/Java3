/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.DangNhapModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DangNhapRepository {
    public DangNhapModel getDangNhap(String user,String pass,String Role){
        try {
            Connection conn=jdbcUtil.jdbcUtil.getConnection();
            String sql="select UserName,[PassWord] from USERS where UserName=? and [PassWord]=? and [Role]=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, Role);
            ResultSet rs=ps.executeQuery();
            while (rs.next()==true) {                
                DangNhapModel dn=new DangNhapModel();
                dn.setUsername(user);
                return dn;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
