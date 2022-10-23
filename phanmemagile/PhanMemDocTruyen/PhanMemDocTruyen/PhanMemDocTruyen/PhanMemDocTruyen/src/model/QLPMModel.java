/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class QLPMModel {
    private int maTruyen;
    private String ten;
    private String  theLoai;
    private String trangThai;
    private int namPhatHanh;
    private int Tap;

    public QLPMModel() {
    }

    public QLPMModel(int maTruyen, String ten, String theLoai, String trangThai, int namPhatHanh, int Tap) {
        this.maTruyen = maTruyen;
        this.ten = ten;
        this.theLoai = theLoai;
        this.trangThai = trangThai;
        this.namPhatHanh = namPhatHanh;
        this.Tap = Tap;
    }

    public int getMaTruyen() {
        return maTruyen;
    }

    public void setMaTruyen(int maTruyen) {
        this.maTruyen = maTruyen;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getNamPhatHanh() {
        return namPhatHanh;
    }

    public void setNamPhatHanh(int namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }

    public int getTap() {
        return Tap;
    }

    public void setTap(int Tap) {
        this.Tap = Tap;
    }
    
}
