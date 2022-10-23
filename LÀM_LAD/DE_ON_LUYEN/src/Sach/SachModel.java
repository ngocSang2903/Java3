/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sach;

/**
 *
 * @author Admin
 */
public class SachModel {
    private int id;
    private String ten;
    private double dongia;
    private int soluong;
    private int tacgia;

    public SachModel() {
    }

    public SachModel(int id, String ten, double dongia, int soluong, int tacgia) {
        this.id = id;
        this.ten = ten;
        this.dongia = dongia;
        this.soluong = soluong;
        this.tacgia = tacgia;
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

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getTacgia() {
        return tacgia;
    }

    public void setTacgia(int tacgia) {
        this.tacgia = tacgia;
    }

    
    
}
