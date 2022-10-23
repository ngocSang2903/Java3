/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVienDiem;
import Repository.QuanLySinhVienDiemRepository;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLySinhVienDiemService {

    private QuanLySinhVienDiemRepository quanLySinhVienDiemRepository;

    public QuanLySinhVienDiemService() {
        quanLySinhVienDiemRepository = new QuanLySinhVienDiemRepository();
    }

    public ArrayList<SinhVienDiem> getlist() {
        return this.quanLySinhVienDiemRepository.all();
    }

    public void add(SinhVienDiem svd) {
        this.quanLySinhVienDiemRepository.insert(svd);
    }

    public void update(String ma, SinhVienDiem svd) {
        this.quanLySinhVienDiemRepository.update(ma, svd);
    }

    public void delete(String ma) {
        this.quanLySinhVienDiemRepository.delete(ma);
    }
    
    public SinhVienDiem findma(String ma){
        return this.quanLySinhVienDiemRepository.findMa(ma);
    }

}
