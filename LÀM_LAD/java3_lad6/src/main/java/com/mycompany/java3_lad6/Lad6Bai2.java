/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java3_lad6;

/**
 *
 * @author Admin
 */
public class Lad6Bai2 {
    private String Name;
    private String address;
    private String Parent;
    private String Contac;
    private String Standar;
    private String fess;

    public Lad6Bai2() {
    }

    public Lad6Bai2(String Name, String address, String Parent, String Contac, String Standar, String fess) {
        this.Name = Name;
        this.address = address;
        this.Parent = Parent;
        this.Contac = Contac;
        this.Standar = Standar;
        this.fess = fess;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParent() {
        return Parent;
    }

    public void setParent(String Parent) {
        this.Parent = Parent;
    }

    public String getContac() {
        return Contac;
    }

    public void setContac(String Contac) {
        this.Contac = Contac;
    }

    public String getStandar() {
        return Standar;
    }

    public void setStandar(String Standar) {
        this.Standar = Standar;
    }

    public String getFess() {
        return fess;
    }

    public void setFess(String fess) {
        this.fess = fess;
    }

    
    
}
