/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khach_Hang;

/**
 *
 * @author Admin
 */
public class KhachHangModel {
    private int id;
    private String ten,diachi,email;
    private int tuoi;
    private int gioitinh;

    public KhachHangModel() {
    }

    public KhachHangModel(int id, String ten, String diachi, String email, int tuoi, int gioitinh) {
        this.id = id;
        this.ten = ten;
        this.diachi = diachi;
        this.email = email;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }
       
}
