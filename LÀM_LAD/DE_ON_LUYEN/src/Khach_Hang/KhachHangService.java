/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khach_Hang;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhachHangService {

    private KhachHangRepository khachHangRepository = new KhachHangRepository();

    public ArrayList<KhachHangModel> all() {
        return khachHangRepository.all();
    }

    public void insert(KhachHangModel kh) {
        this.khachHangRepository.insert(kh);
    }

    public void update(int id, KhachHangModel kh) {
        this.khachHangRepository.update(id, kh);
    }

    public void delete(int id) {
        this.khachHangRepository.delete(id);
    }
}
