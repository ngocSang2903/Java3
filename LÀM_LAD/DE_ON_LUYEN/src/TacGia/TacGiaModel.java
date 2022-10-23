/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TacGia;

/**
 *
 * @author Admin
 */

public class TacGiaModel {
    private int id;
    private String ten;
    private int sodienthoai;
    private String email;

    public TacGiaModel() {
    }

    public TacGiaModel(int id, String ten, int sodienthoai, String email) {
        this.id = id;
        this.ten = ten;
        this.sodienthoai = sodienthoai;
        this.email = email;
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

    public int getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(int sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
