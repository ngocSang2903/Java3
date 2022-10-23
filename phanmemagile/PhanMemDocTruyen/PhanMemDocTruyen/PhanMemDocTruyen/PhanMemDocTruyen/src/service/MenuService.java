/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Repository.MenuRepository;
import Repository.QLPMRepository;
import java.util.ArrayList;
import model.QLPMModel;

/**
 *
 * @author Admin
 */
public class MenuService {

    private MenuRepository menuRepository = new MenuRepository();

    public ArrayList<QLPMModel> FinddTrangThai(String TrangThai) {
        return this.menuRepository.FinddTrangThai(TrangThai);
    }

    public ArrayList<QLPMModel> FindTheLoai(String TheLoai) {
        return this.menuRepository.FindTheLoai(TheLoai);
    }

    public ArrayList<QLPMModel> FindNam(int Nam) {
        return this.menuRepository.FindNam(Nam);
    }
    
        public ArrayList<QLPMModel> Findten(String ten) {
        return this.menuRepository.FindTen(ten);
    }

}
