/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java3_lad5;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class bai1 {
    public static void main(String[] args) {
        
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QL_Sinhvien;trustServerCertificate=true;";

        try (Connection con = DriverManager.getConnection(connectionUrl,"sa","123456789"); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM Student";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the- result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("MaSV") + " " + rs.getString("HoTen")+ " " + rs.getString("Email")
                        + " " + rs.getString("sdt")+ " " + rs.getString("GioiTinh")+ " " + rs.getString("DiaChi"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
