/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhanVienService {

    NhanVienRepository nhanVienRepository = new NhanVienRepository();

    public ArrayList<NhanVienModel> all() {
        return this.nhanVienRepository.all();
    }

    public void insert(NhanVienModel nhanVienModel) {
        this.nhanVienRepository.insert(nhanVienModel);
    }

    public void update(int id, NhanVienModel nhanVienModel) {
        this.nhanVienRepository.update(id, nhanVienModel);
    }

    public void delete(int id) {
        this.nhanVienRepository.delete(id);
    }
}
