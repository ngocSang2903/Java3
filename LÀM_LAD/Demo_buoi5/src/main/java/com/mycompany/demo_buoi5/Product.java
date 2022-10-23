/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo_buoi5;

/**
 *
 * @author Admin
 */
public class Product {
    private int id;
    private String tenSP;
    private int soLg;
    private double dongia;
    private String mausac;
    private int danhMucId;

    public Product() {
    }

    public Product(int id, String tenSP, int soLg, double dongia, String mausac, int danhMucId) {
        this.id = id;
        this.tenSP = tenSP;
        this.soLg = soLg;
        this.dongia = dongia;
        this.mausac = mausac;
        this.danhMucId = danhMucId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public int getDanhMucId() {
        return danhMucId;
    }

    public void setDanhMucId(int danhMucId) {
        this.danhMucId = danhMucId;
    }
    
}
