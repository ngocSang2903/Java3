/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TacGia;

import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author Admin
 */
public class jdbsUtil {

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url="jdbc:sqlserver://localhost:1433;databaseName=ql_sach_lt1;trustServerCertificate=true;";
                String user="sa";
                String pass="123456789";
                conn=DriverManager.getConnection(url,user,pass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
