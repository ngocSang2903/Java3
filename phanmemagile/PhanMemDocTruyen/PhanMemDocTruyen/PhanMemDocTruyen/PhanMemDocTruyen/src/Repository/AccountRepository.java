
package Repository;

import JdbcUtil.JdbcUtil;
import model.SinhVien;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.QuanLi;

public class AccountRepository {
    public void insert(SinhVien svn){
        try {
                   
            Connection conn = JdbcUtil.getConnection();
            String query = "INSERT INTO AccountData(ho_ten, email, password, gioi_tinh)"
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, svn.getHoTen());
            ps.setString(2, svn.getEmail());
            ps.setString(3, svn.getPassword());
            ps.setBoolean(4, svn.isGioiTinh());
            
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public SinhVien getAccount(String user, String passWord){
        try {     
            Connection conn = JdbcUtil.getConnection();
            String query = "SELECT email, password FROM AccountData WHERE email = ? and password = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, passWord);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next() == true){
                SinhVien sv = new SinhVien();
                sv.setEmail(user);
                return sv;
            }
        } catch (SQLException e) {
            e.printStackTrace();
          }
        return null;
    }
    
    public ArrayList<SinhVien> all(){
        ArrayList<SinhVien> listsv = new ArrayList<>();
        try {     
            Connection conn = JdbcUtil.getConnection();
            String query = "select * from AccountData";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while(rs.next() == true){
                int maSV = rs.getInt("MaSV");
                String hoTen = rs.getString("ho_ten");
                String email = rs.getString("email");
                String password = rs.getString("password");
                boolean gioi_tinh = rs.getBoolean("gioi_tinh");
                
                SinhVien sv = new SinhVien(maSV, hoTen, email, password, gioi_tinh);
                listsv.add(sv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
          }
        return listsv;
    }
    public QuanLi getAccountManager(String user, String passWord){
        try {     
            Connection conn = JdbcUtil.getConnection();
            String query = "SELECT email, password FROM AccountManagerData WHERE email = ? and password = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, passWord);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next() == true){
                QuanLi ql = new QuanLi();
                ql.setEmail(user);
                return ql;
            }
        } catch (SQLException e) {
            e.printStackTrace();
          }
        return null;
    }
}
