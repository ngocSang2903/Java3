/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static java.lang.String.format;

/**
 *
 * @author Admin
 */
public class SinhVienDiem {
    private String maSV,tenSV;
    private double TAnh,THoc,Gduc;

    public SinhVienDiem() {
    }

    public SinhVienDiem(String maSV, String tenSV, double TAnh, double THoc, double Gduc) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.TAnh = TAnh;
        this.THoc = THoc;
        this.Gduc = Gduc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getTAnh() {
        return TAnh;
    }

    public void setTAnh(double TAnh) {
        this.TAnh = TAnh;
    }

    public double getTHoc() {
        return THoc;
    }

    public void setTHoc(double THoc) {
        this.THoc = THoc;
    }

    public double getGduc() {
        return Gduc;
    }

    public void setGduc(double Gduc) {
        this.Gduc = Gduc;
    }
    
    public String DiemTB(){  
        return format("%.1f",(TAnh+THoc+Gduc)/3);
    }

}
