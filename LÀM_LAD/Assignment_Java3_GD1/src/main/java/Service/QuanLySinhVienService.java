/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import Repository.QuanLySinhVienRepository;
import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class QuanLySinhVienService {

    private QuanLySinhVienRepository quanLySinhVienRepository;

    public QuanLySinhVienService() {
        quanLySinhVienRepository = new QuanLySinhVienRepository();
    }

    public ArrayList<SinhVien> getlist() {
        return this.quanLySinhVienRepository.all();
    }

    public void save(SinhVien sv) {
        this.quanLySinhVienRepository.insert(sv);
    }

    public void delete(String ma) {
        this.quanLySinhVienRepository.delete(ma);

    }

    public void update(String ma, SinhVien sv) {
        this.quanLySinhVienRepository.update(ma, sv);
    }

    public void insertexcel(String excelMa, String excelHoten, String excelEmail, int excelSodt, String excelgt, String exceldiachi, String excelanh) {
        this.quanLySinhVienRepository.insertexcel(excelMa, excelHoten, excelEmail, excelSodt, excelgt, exceldiachi, excelanh);
    }

}
