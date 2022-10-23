/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java3_lad5;

/**
 *
 * @author Admin
 */
public class Student {
    private String masv;
    private String ten;
    private String Email;
    int  sdt;
    private String gioitinh;
    private String diachi;

    public Student() {
    }

    public Student(String masv, String ten, String Email, int sdt, String gioitinh, String diachi) {
        this.masv = masv;
        this.ten = ten;
        this.Email = Email;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
}
